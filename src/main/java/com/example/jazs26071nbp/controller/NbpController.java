package com.example.jazs26071nbp.controller;

import com.example.jazs26071nbp.service.NbpService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.time.LocalDate;

@RestController
@RequestMapping("/currency")
public class NbpController {

   private final NbpService nbpService;

    public NbpController(NbpService nbpService) {
        this.nbpService = nbpService;
    }



    @GetMapping("/{currency}/{startDate}/{endDate}")
    public ResponseEntity<Double> getAverageRateForCurrency(
            @PathVariable String currency,
            @PathVariable @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate startDate,
            @PathVariable @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate endDate) {
        BigDecimal averageRate = NbpService.getAverageRateForCurrency(currency, startDate, endDate);
        if (averageRate == null) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(averageRate.doubleValue());
    }
}
