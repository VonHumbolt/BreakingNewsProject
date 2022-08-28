package com.kaankaplan.breaking_news_mvc.controllers;

import com.kaankaplan.breaking_news_mvc.models.New;
import com.kaankaplan.breaking_news_mvc.service.abstracts.NewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/api/v1/news")
public class NewController {

    @Autowired
    private NewService newService;

    @RequestMapping("/")
    public String homePage() {

        List<New> allNews = newService.getAllNews();

        for (New n : allNews){
            System.out.println(n.getTitle() + " - " + n.getPublishedAt());
        }

        return "home-page";
    }

}
