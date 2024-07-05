package com.kangenh_spring6.services;

import com.kangenh_spring6.domain.Author;
import com.kangenh_spring6.repository.AuthorRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthorServiceImpl implements AuthorService {

    private final AuthorRepository authorRepository;

    @Override
    public Iterable<Author> allAuthors() {
        return authorRepository.findAll();
    }
}
