package com.kaankaplan.breaking_news_mvc.service.concretes;

import com.kaankaplan.breaking_news_mvc.models.New;
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
    public List<New> getAllNews() {
        return newsRepository.getAllNews();
    }

    @Override
    public New getNewsById(int newsId) {
        return newsRepository.getNewsById(newsId);
    }

    @Override
    public List<New> getNewsBySourceId(int sourceId) {
        return newsRepository.getNewsBySourceId(sourceId);
    }

    @Override
    public List<New> searchNew(String text) {
        return newsRepository.searchNew(text);
    }
}
