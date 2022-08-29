package com.kaankaplan.breaking_news_mvc.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Id;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class New {

    @Id
    private int id;
    private String title;
    private String subtitle;
    private String content;
    private Date publishedAt;
    private NewsImage newsImage;

//    private Source source;

}
