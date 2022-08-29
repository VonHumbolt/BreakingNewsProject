package com.kaankaplan.breaking_news_mvc.service.concretes;

import com.kaankaplan.breaking_news_mvc.models.dtos.NewDto;
import com.kaankaplan.breaking_news_mvc.repositories.abstarcts.NewsRepository;
import com.kaankaplan.breaking_news_mvc.service.abstracts.NewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NewServiceImpl implements NewService {

    @Autowired
    private NewsRepository newsRepository;

    @Override
    public List<NewDto> getAllNews() {
        return newsRepository.getAllNews();
    }

    @Override
    public NewDto getNewsById(int newsId) {
        return newsRepository.getNewsById(newsId);
    }

    @Override
    public List<NewDto> getNewsBySourceId(int sourceId) {
        return newsRepository.getNewsBySourceId(sourceId);
    }

    @Override
    public List<NewDto> getNewsByAuthorId(int authorId) {
        return newsRepository.getNewsByAuthorId(authorId);
    }

    @Override
    public List<NewDto> searchNew(String text) {
        return newsRepository.searchNew(text);
    }
}
