package org.labexercise.demo.topDownApproach.interfaces;

import org.labexercise.demo.topDownApproach.Book;

import java.util.List;

public interface BookService {
    List<Book> createBooks (String title, String author, String isbn);
}
