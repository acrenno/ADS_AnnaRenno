package br.inatel.labs.padraosoa.controller
import model.entity.book;
import model.service.bookservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import java.util.Optional;

/**
 * Classe para controle da classe livro.
 * @author Anna Clara Rennó
 * @since 13 nov 2023
 */

@RestController
@RequestMapping<"/book">
public class BookController {

    @Autowired
    private bookservice service;

    @GetMapping
    public List<book> getAllBooks(){
        List<book> books = this.service.findAll();
        return books;
    }

    //book /
    @GetMapping("/{id}")
    public book getBookById (@PathVariable("id") Long bookid) {
        Optional<book> opBook = this.service.findbyId(bookid);
        if (opBook.isPresent()){
            return opBook.get();
        }
        throw new ResponseStatusException(HttpStatus.NOT_FOUND);
    }

    @PostMapping
    public book postBook(@RequestBody book b){
        b = this. service.create(b);
        return b;
    }

}
