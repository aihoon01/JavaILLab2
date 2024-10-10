package org.labexercise.demo.topDownApproach.services;

import org.junit.jupiter.api.Test;
import org.labexercise.demo.topDownApproach.Book;
import org.labexercise.demo.topDownApproach.interfaces.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class BookServiceImplTest {

    @Autowired
    private BookServiceImpl bookService;

    @Test
    void shouldCreateBooks() {
        List<Book> books = bookService.createBooks("Effective Java", "steph", "2023isbn");
        assertEquals(1, books.size());
        assertEquals("Effective Java", books.get(0).getTitle());
    }
}