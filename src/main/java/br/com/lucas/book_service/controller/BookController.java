package br.com.lucas.book_service.controller;

import br.com.lucas.book_service.dto.ExchangeDto;
import br.com.lucas.book_service.environment.IntanceInformationService;
import br.com.lucas.book_service.model.Book;
import br.com.lucas.book_service.proxy.ExchangeProxy;
import br.com.lucas.book_service.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.print.attribute.standard.MediaName;
import java.util.Date;
import java.util.HashMap;

@RestController
@RequestMapping("book-service")
public class BookController {

    @Autowired
    private IntanceInformationService informationService;

    @Autowired
    private BookRepository repository;

    @Autowired
    private ExchangeProxy proxy;

    @GetMapping(value = "/{id}/{currency}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Book findBook(@PathVariable("id") Long id, @PathVariable("currency") String currency) {

        String port = informationService.retrieveServerPort();

        var book = repository.findById(id).orElseThrow();

        ExchangeDto exchangeDto = proxy.getExchange(book.getPrice(), "USD", currency);

        book.setEnvironment(port + " FEING");
        book.setPrice(exchangeDto.getConvertedValue());
        book.setCurrency(currency);

        return book;
    }
}
