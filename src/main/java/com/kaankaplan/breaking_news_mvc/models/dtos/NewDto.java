package com.kaankaplan.breaking_news_mvc.models.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class NewDto {

    private int newsId;
    private String title;
    private String subtitle;
    private String content;
    private Date publishedDate;
    private String sourceName;
    private String authorName;
    private String imageUrl;

}
