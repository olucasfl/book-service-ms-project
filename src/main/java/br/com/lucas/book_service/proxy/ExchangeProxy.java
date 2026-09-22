package br.com.lucas.book_service.proxy;

import br.com.lucas.book_service.dto.ExchangeDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.math.BigDecimal;

@FeignClient(name = "exchange-service", url = "localhost:8000")
public interface ExchangeProxy {

    @GetMapping(value = "/exchange-service/{amount}/{from}/{to}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ExchangeDto getExchange(@PathVariable("amount") Double amount,
                                   @PathVariable("from") String from,
                                   @PathVariable("to") String to);
}
