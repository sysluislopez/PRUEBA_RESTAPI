package com.example.rest_Example.Repository;

import com.example.rest_Example.Entity.Book;
import com.sun.org.glassfish.gmbal.ParameterNames;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotypoe.Repository;


import java.awt.print.Pageable;
import java.io.Serializable;
import java.util.List;

@Repository
@CrossOrigin(value = {})
public interface BoookRepository extends MongoRepository<Book, Serializable> {

    @RestResource(path= "name", rel="name")
    List<Book> findByName (@Param("name")String name );

    @RestResource(path= "ISBN", rel="ISBN")
    List<Book> findByISBN(@Param("ISBN")String ISBN);


}
