package com.example.jazs26071nbp.service;

import com.example.jazs26071nbp.model.NbpRate;
import com.example.jazs26071nbp.repository.NbpRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.util.Collections;
import java.util.List;

@Service
public class NbpService {

    private static final String NBP_API_URL = "http://api.nbp.pl/api/exchangerates/rates/{table}/{code}/{startDate}/{endDate}/\n";

    private static RestTemplate restTemplate = null;
    private NbpRepository nbpRepository;

    public NbpService(RestTemplate restTemplate, NbpRepository nbpRepository) {
        this.restTemplate = restTemplate;
        this.nbpRepository = nbpRepository;
    }


    public static BigDecimal getAverageRateForCurrency(String currency, LocalDate startDate, LocalDate endDate) {
        List<NbpRate> rates = getRatesForCurrency(currency, startDate, endDate);

        BigDecimal sumRate = rates.stream()
                .map(NbpRate::getMid)
                .reduce(BigDecimal.ZERO, BigDecimal::add);

        BigDecimal averageRate = BigDecimal.ZERO;
        if (!rates.isEmpty()) {
            averageRate = sumRate.divide(BigDecimal.valueOf(rates.size()), 4, RoundingMode.HALF_UP);
        }
        return averageRate;
    }

    private static List<NbpRate> getRatesForCurrency(String currency, LocalDate startDate, LocalDate endDate) {
        String apiUrl = NBP_API_URL.replace("{currency}", currency)
                .replace("{startDate}", startDate.toString())
                .replace("{endDate}", endDate.toString());

        NbpRate response = restTemplate.getForObject(apiUrl, NbpRate.class);
        return response != null ? response.getRates() : Collections.emptyList();
    }
}
