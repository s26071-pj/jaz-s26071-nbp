package com.example.jazs26071nbp.repository;

import com.example.jazs26071nbp.controller.NbpController;
import com.example.jazs26071nbp.model.NbpCurrencyRate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Currency;

@Repository
public interface NbpRepository extends JpaRepository<NbpCurrencyRate, Long> {
}
