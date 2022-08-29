package com.kaankaplan.breaking_news_mvc.service.abstracts;

import com.kaankaplan.breaking_news_mvc.models.dtos.NewDto;

import java.util.List;

public interface NewService {

    List<NewDto> getAllNews();

    NewDto getNewsById(int newsId);

    List<NewDto> getNewsBySourceId(int sourceId);
    List<NewDto> getNewsByAuthorId(int authorId);

    List<NewDto> searchNew(String text);
}
