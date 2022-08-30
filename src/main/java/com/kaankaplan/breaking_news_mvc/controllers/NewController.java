package com.kaankaplan.breaking_news_mvc.controllers;

import com.kaankaplan.breaking_news_mvc.models.dtos.NewDto;
import com.kaankaplan.breaking_news_mvc.models.dtos.SearchNewDto;
import com.kaankaplan.breaking_news_mvc.service.abstracts.NewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/api/v1/news")
public class NewController {

    @Autowired
    private NewService newService;

    @RequestMapping("/")
    public String getAllNewDtos(@ModelAttribute("searchNewDto") SearchNewDto searchNewDto, Model model) {

        model.addAttribute("allNews", newService.getAllNews());

        return "home";
    }

    @RequestMapping("/{newsId}")
    public String getById(@PathVariable int newsId, Model model){
        NewDto newsById = newService.getNewsById(newsId);

        model.addAttribute("newDto", newsById);

        return "detail-page";
    }

    @RequestMapping("/getBySourceId/{sourceId}")
    public String getNewsBySourceId(@PathVariable int sourceId, @ModelAttribute("searchNewDto") SearchNewDto searchNewDto, Model model) {

        List<NewDto> allNews = newService.getNewsBySourceId(sourceId);

        model.addAttribute("allNews", allNews);
        model.addAttribute("name", allNews.get(0).getSourceName());

        return "home";
    }
    @RequestMapping("/getByAuthorId/{authorId}")
    public String getNewsByAuthorId(@PathVariable int authorId, @ModelAttribute("searchNewDto") SearchNewDto searchNewDto, Model model) {

        List<NewDto> allNews = newService.getNewsByAuthorId(authorId);

        model.addAttribute("allNews", allNews);
        model.addAttribute("name", allNews.get(0).getAuthorName());

        return "home";
    }


    @RequestMapping("/search")
    public String searchNew(@ModelAttribute("searchNewDto") SearchNewDto searchNewDto, Model model) {
        List<NewDto> newList = newService.searchNew(searchNewDto.getFilterText());

        model.addAttribute("allNews", newList);
        model.addAttribute("searchResultSize", newList.size());

        return "home";
    }

}
