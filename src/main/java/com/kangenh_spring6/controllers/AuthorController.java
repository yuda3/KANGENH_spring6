package com.kangenh_spring6.controllers;

import com.kangenh_spring6.services.AuthorService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class AuthorController {
    private final AuthorService authorService;

    @GetMapping("/author")
    public String author(Model model) {
        model.addAttribute("author", authorService.allAuthors());
        return "author";
    }
}
