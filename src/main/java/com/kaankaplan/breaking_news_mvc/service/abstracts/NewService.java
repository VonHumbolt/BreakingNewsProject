package com.kaankaplan.breaking_news_mvc.service.abstracts;

import com.kaankaplan.breaking_news_mvc.models.New;

import java.util.List;

public interface NewService {

    List<New> getAllNews();

    New getNewsById(int newsId);

    List<New> getNewsBySourceId(int sourceId);

    List<New> searchNew(String text);
}
