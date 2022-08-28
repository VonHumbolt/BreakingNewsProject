package com.kaankaplan.breaking_news_mvc.repositories.abstarcts;

import com.kaankaplan.breaking_news_mvc.models.New;

import java.util.List;

public interface NewsRepository {

    List<New> getAllNews();
}
