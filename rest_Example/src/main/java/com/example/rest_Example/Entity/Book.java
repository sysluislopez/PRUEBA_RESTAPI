package com.example.rest_Example.Entity;

import com.sun.istack.internal.NotNull;

import java.io.Serializable;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


import javax.validation.constraint.NotNull;
import java.util.Collection;


@Document(Collection="Book")
public class Book implements Serializable {

    @Id
    @NotNull
    private int Id;
    private String ISBN;
    private String name;
    private String comment;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }



}
