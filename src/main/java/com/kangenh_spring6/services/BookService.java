package com.kangenh_spring6.services;

import com.kangenh_spring6.domain.Book;

public interface BookService {

    Iterable<Book> findAll();
}
