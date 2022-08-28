package com.kaankaplan.breaking_news_mvc.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class New {

    private int id;
    private String title;
    private String subtitle;
    private Source source;
    private String content;
    private Date publishedAt;
    private NewsImage newsImage;
}
