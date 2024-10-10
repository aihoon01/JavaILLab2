package org.labexercise.demo.topDownApproach.stubs;

import org.labexercise.demo.topDownApproach.Book;
import org.labexercise.demo.topDownApproach.interfaces.BookService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookServiceStub implements BookService {
    @Override
    public List<Book> createBooks(String title, String author, String isbn) {
        // Return a static list of books as a stub
        List<Book> books = new ArrayList<>();
        books.add(new Book("Effective Java", "Joshua Bloch", "2024isbn"));
        return books;
    }
}
