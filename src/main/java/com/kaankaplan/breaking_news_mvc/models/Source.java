package com.kaankaplan.breaking_news_mvc.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.relational.core.mapping.MappedCollection;

import javax.persistence.Id;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Source {
    @Id
    private int sourceId;
    private String name;

    @MappedCollection(idColumn = "source_id")
    private List<New> newList;
    private List<Author> author;
}
