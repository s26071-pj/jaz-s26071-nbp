package com.example.jazs26071nbp.configuration;

import com.example.jazs26071nbp.model.NbpCurrencyRate;
import com.example.jazs26071nbp.repository.NbpRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

@Configuration
public class RestTemplateConfiguration {

    @Bean
    public RestTemplate restTemplemate() {
        return new RestTemplate();
    }

    @Bean
    public NbpRepository nbpRepository(){
        return new NbpRepository() {
            @Override
            public void flush() {

            }

            @Override
            public <S extends NbpCurrencyRate> S saveAndFlush(S entity) {
                return null;
            }

            @Override
            public <S extends NbpCurrencyRate> List<S> saveAllAndFlush(Iterable<S> entities) {
                return null;
            }

            @Override
            public void deleteAllInBatch(Iterable<NbpCurrencyRate> entities) {

            }

            @Override
            public void deleteAllByIdInBatch(Iterable<Long> longs) {

            }

            @Override
            public void deleteAllInBatch() {

            }

            @Override
            public NbpCurrencyRate getOne(Long aLong) {
                return null;
            }

            @Override
            public NbpCurrencyRate getById(Long aLong) {
                return null;
            }

            @Override
            public NbpCurrencyRate getReferenceById(Long aLong) {
                return null;
            }

            @Override
            public <S extends NbpCurrencyRate> List<S> findAll(Example<S> example) {
                return null;
            }

            @Override
            public <S extends NbpCurrencyRate> List<S> findAll(Example<S> example, Sort sort) {
                return null;
            }

            @Override
            public <S extends NbpCurrencyRate> List<S> saveAll(Iterable<S> entities) {
                return null;
            }

            @Override
            public List<NbpCurrencyRate> findAll() {
                return null;
            }

            @Override
            public List<NbpCurrencyRate> findAllById(Iterable<Long> longs) {
                return null;
            }

            @Override
            public <S extends NbpCurrencyRate> S save(S entity) {
                return null;
            }

            @Override
            public Optional<NbpCurrencyRate> findById(Long aLong) {
                return Optional.empty();
            }

            @Override
            public boolean existsById(Long aLong) {
                return false;
            }

            @Override
            public long count() {
                return 0;
            }

            @Override
            public void deleteById(Long aLong) {

            }

            @Override
            public void delete(NbpCurrencyRate entity) {

            }

            @Override
            public void deleteAllById(Iterable<? extends Long> longs) {

            }

            @Override
            public void deleteAll(Iterable<? extends NbpCurrencyRate> entities) {

            }

            @Override
            public void deleteAll() {

            }

            @Override
            public List<NbpCurrencyRate> findAll(Sort sort) {
                return null;
            }

            @Override
            public Page<NbpCurrencyRate> findAll(Pageable pageable) {
                return null;
            }

            @Override
            public <S extends NbpCurrencyRate> Optional<S> findOne(Example<S> example) {
                return Optional.empty();
            }

            @Override
            public <S extends NbpCurrencyRate> Page<S> findAll(Example<S> example, Pageable pageable) {
                return null;
            }

            @Override
            public <S extends NbpCurrencyRate> long count(Example<S> example) {
                return 0;
            }

            @Override
            public <S extends NbpCurrencyRate> boolean exists(Example<S> example) {
                return false;
            }

            @Override
            public <S extends NbpCurrencyRate, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
                return null;
            }
        };
    }

}
