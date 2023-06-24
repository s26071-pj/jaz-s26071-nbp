package com.example.jazs26071nbp.model;

import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.List;

@Component
public class NbpRate {
    private BigDecimal mid;

    public BigDecimal getMid() {
        return mid;
    }

    public void setMid(BigDecimal mid) {
        this.mid = mid;
    }

    private List<NbpRate> rates;

    public List<NbpRate> getRates() {
        return rates;
    }

    public void setRates(List<NbpRate> rates) {
        this.rates = rates;
    }
}
