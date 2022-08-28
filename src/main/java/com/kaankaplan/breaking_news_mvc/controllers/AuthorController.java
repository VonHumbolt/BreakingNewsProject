package com.kaankaplan.breaking_news_mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api/v1/authors")
public class AuthorController {

    @RequestMapping("/{authorId}")
    public String getAuthorsNewsById(@PathVariable int authorId) {

        // service code

        return "author-news";
    }
}
