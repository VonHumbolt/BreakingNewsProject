package com.kaankaplan.breaking_news_mvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api/v1/sources")
public class SourceController {

    @RequestMapping("/{sourceId}")
    public String getSourceNewsById(@PathVariable int sourceId) {

        // service code

        return "news-source-id";
    }

}
