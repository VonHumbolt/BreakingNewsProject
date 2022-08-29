package com.kaankaplan.breaking_news_mvc.controllers;

import com.kaankaplan.breaking_news_mvc.models.New;
import com.kaankaplan.breaking_news_mvc.service.abstracts.NewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
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

    @RequestMapping("/{newsId}")
    public String getById(@PathVariable int newsId){
        New newsById = newService.getNewsById(newsId);

        return "home-page";
    }

    @RequestMapping("/getBySourceId/{sourceId}")
    public String getNewsBySourceId(@PathVariable int sourceId) {

        List<New> allNews = newService.getNewsBySourceId(sourceId);

        for (New n : allNews){
            System.out.println(n.getTitle() + " - " + n.getPublishedAt());
        }

        return "news-source-id";
    }

    @RequestMapping("/search/{text}")
    public String searchNew(@PathVariable String text) {
        List<New> newList = newService.searchNew(text);

        for (New n : newList){
            System.out.println(n.getTitle());
        }
        return "home-page";

    }

}
