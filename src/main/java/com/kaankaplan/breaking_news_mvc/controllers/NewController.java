package com.kaankaplan.breaking_news_mvc.controllers;

import com.kaankaplan.breaking_news_mvc.models.dtos.NewDto;
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
    public String getAllNewDtos() {

        List<NewDto> allNews = newService.getAllNews();

        for (NewDto n : allNews){
            System.out.println(n.getImageUrl() + " - " + n.getSourceName());
        }

        return "home-page";
    }

    @RequestMapping("/{newsId}")
    public String getById(@PathVariable int newsId){
        NewDto newsById = newService.getNewsById(newsId);
        System.out.println(newsById.getSourceName());
        return "home-page";
    }

    @RequestMapping("/getBySourceId/{sourceId}")
    public String getNewsBySourceId(@PathVariable int sourceId) {

        List<NewDto> allNews = newService.getNewsBySourceId(sourceId);

        for (NewDto n : allNews){
            System.out.println(n.getTitle() + " - " + n.getSourceName());
        }

        return "news-source-id";
    }
    @RequestMapping("/getByAuthorId/{authorId}")
    public String getNewsByAuthorId(@PathVariable int authorId) {

        List<NewDto> allNews = newService.getNewsByAuthorId(authorId);

        for (NewDto n : allNews){
            System.out.println(n.getTitle() + " - " + n.getSourceName());
        }

        return "news-source-id";
    }



    @RequestMapping("/search/{text}")
    public String searchNew(@PathVariable String text) {
        List<NewDto> newList = newService.searchNew(text);

        for (NewDto n : newList){
            System.out.println(n.getTitle());
        }
        return "home-page";

    }

}
