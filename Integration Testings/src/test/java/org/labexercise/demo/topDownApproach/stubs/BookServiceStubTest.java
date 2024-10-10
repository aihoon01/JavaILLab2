package org.labexercise.demo.topDownApproach.stubs;

import org.junit.jupiter.api.Test;
import org.labexercise.demo.topDownApproach.Book;
import org.labexercise.demo.topDownApproach.interfaces.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class BookServiceStubTest {

    @Autowired
    private BookServiceStub bookService;

    @Test
    void shouldCreateBooks() {
        List<Book> books = bookService.createBooks("Effective Java", null, null);
        assertEquals(1, books.size());
        assertEquals("Effective Java", books.get(0).getTitle());
    }
}