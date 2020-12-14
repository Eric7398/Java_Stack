package com.mvc.services;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.stereotype.Service;
import com.mvc.models.book;
import com.mvc.repositories.BookRepository;

@Service
public class BookService {
    // adding the book repository as a dependency
    private final BookRepository bookRepository;
    
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
    // returns all the books
    public List<book> allBooks() {
        return bookRepository.findAll();
    }
    // creates a book
    public book createBook(book b) {
        return bookRepository.save(b);
    }
    // retrieves a book
    public book findBook(Long id) {
        Optional<book> optionalBook = bookRepository.findById(id);
        if(optionalBook.isPresent()) {
            return optionalBook.get();
        } else {
            return null;
        }
    }
    // update a book
	public book updateBook(Long id, String title, String desc, String lang, Integer numOfPages) {
		book book = this.findBook(id);
		book.setTitle(title);
		book.setDescription(desc);
		book.setLanguage(lang);
		book.setNumberOfPages(numOfPages);
		bookRepository.save(book);
		return book;
	}
    // delete a book
    public void deleteBook(Long id) {
    	bookRepository.deleteById(id);
    }
	public book updateBook(@Valid book book) {
		book target = this.findBook(book.getId());
		target.setTitle(book.getTitle());
		target.setDescription(book.getDescription());
		target.setLanguage(book.getLanguage());
		target.setNumberOfPages(book.getNumberOfPages());
		return bookRepository.save(target);
	}

}