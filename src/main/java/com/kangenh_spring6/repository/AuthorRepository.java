package com.kangenh_spring6.repository;

import com.kangenh_spring6.domain.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Long> {
}
