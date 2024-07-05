package com.kangenh_spring6.controllers;

import com.kangenh_spring6.services.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class BookController {

    private final BookService bookService;

    @GetMapping("/book")
    public String getBooks(Model model){

        model.addAttribute("books", bookService.findAll());

        return "books";
    }


}
