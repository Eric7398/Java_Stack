package com.mvc.repositories;

import com.mvc.models.book;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository 
public interface BookRepository extends CrudRepository<book, Long>{
    // this method retrieves all the books from the database
    List<book> findAll();
    // this method finds books with descriptions containing the search string
    List<book> findByDescriptionContaining(String search);
    // this method counts how many titles contain a certain string
    Long countByTitleContaining(String search);
    // this method deletes a book that starts with a specific title
    Long deleteByTitleStartingWith(String search);
    
}