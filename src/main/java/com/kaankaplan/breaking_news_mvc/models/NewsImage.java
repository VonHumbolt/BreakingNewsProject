package com.kaankaplan.breaking_news_mvc.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class NewsImage {
    private int imageId;
    private String imageUrl;
    private New news;
}
