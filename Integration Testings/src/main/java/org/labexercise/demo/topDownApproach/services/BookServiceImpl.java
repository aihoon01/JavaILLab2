package org.labexercise.demo.topDownApproach.services;

import org.labexercise.demo.topDownApproach.Book;
import org.labexercise.demo.topDownApproach.interfaces.BookService;
import org.labexercise.demo.topDownApproach.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {
    private BookRepository bookRepository;

    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public List<Book> createBooks(String title, String author, String isbn) {
        Book book = new Book(title, author, isbn);
        var newBook = bookRepository.save(book);
        return List.of(newBook);
    }
}
