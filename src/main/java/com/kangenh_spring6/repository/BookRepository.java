package com.kangenh_spring6.repository;

import com.kangenh_spring6.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
