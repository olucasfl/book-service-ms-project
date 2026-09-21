package br.com.lucas.book_service.controller;

import br.com.lucas.book_service.environment.IntanceInformationService;
import br.com.lucas.book_service.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.print.attribute.standard.MediaName;
import java.util.Date;

@RestController
@RequestMapping("book-service")
public class BookController {

    @Autowired
    private IntanceInformationService informationService;

    @GetMapping(value = "/{id}/{currency}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Book findBook(@PathVariable("id") Long id, @PathVariable("currency") String currency) {

        String port = informationService.retrieveServerPort();

        return new Book(
                1L,
                "Nigel Poulton",
                "Docker Deep Dive",
                new Date(),
                15.8,
                "BRL",
                port
        );
    }
}
