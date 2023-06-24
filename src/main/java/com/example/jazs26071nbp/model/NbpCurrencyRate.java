package com.example.jazs26071nbp.model;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Size;
import jdk.jfr.DataAmount;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class NbpCurrencyRate {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Schema(description = "id of currency")
    private Long id;

    @Schema(description = "type of choosen currency")
    @Size(min = 0, max = 55)
    private String currency_type;

    @Schema(description = "dates of starting and stoping counting for choosen currency")
    @DateTimeFormat(pattern = "Y-M-D")
    private String date;

    @Schema(description = "Counted rate for choosen currency")
    @Size(min = 0, max = 55)
    private String count_rate;

    @Schema(description = "Date of sending question to the database")
    @DateTimeFormat(pattern = "Y-M-D")
    private String question_date;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCurrency_type() {
        return currency_type;
    }

    public void setCurrency_type(String currency_type) {
        this.currency_type = currency_type;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getCount_rate() {
        return count_rate;
    }

    public void setCount_rate(String count_rate) {
        this.count_rate = count_rate;
    }

    public String getQuestion_date() {
        return question_date;
    }

    public void setQuestion_date(String question_date) {
        this.question_date = question_date;
    }
}
