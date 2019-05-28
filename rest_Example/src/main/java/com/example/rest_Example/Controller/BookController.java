package com.example.rest_Example.Controller;

import com.example.rest_Example.Repository.BoookRepository;
import com.example.rest_Example.Entity.Book;

import com.sun.corba.se.spi.ior.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.management.ObjectName;
import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/Book")
public class BookController {
    @Autowired
    private BoookRepository repository;

    @RequestMapping(value = "/{name}", method = RequestMethod.GET)
    public Book findByName(@PathVariable("name") ObjectName name)
    {
        return repository.findByName(name);
    }

    @RequestMapping(value = "/{ISBN}", method = RequestMethod.GET)
    public Book findByISBN(@PathVariable("ISBN") ObjectName ISBN)
    {
        return repository.findByISBN(ISBN);
    }


    @RequestMapping(value = "/{Id}", method = RequestMethod.PUT)
    public void modifyComment(@PathVariable("Id") ObjectId Id, @Valid @RequestBody Book book)
    {
        book.setId(Id);
        repository.save(book);
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public Book addBook(@Valid @RequestBody Book book) {
        book.setId(ObjectId.get());
        repository.save(book);
        return book;
    }


}
