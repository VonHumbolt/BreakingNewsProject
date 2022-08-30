package com.kaankaplan.breaking_news_mvc.utils.rowmapper;

import com.kaankaplan.breaking_news_mvc.models.dtos.NewDto;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class NewDtoRowMapper implements RowMapper<NewDto> {
    @Override
    public NewDto mapRow(ResultSet rs, int rowNum) throws SQLException {

        NewDto newDto = NewDto.builder()
                .newsId(rs.getInt("id"))
                .title(rs.getString("title"))
                .subtitle(rs.getString("subtitle"))
                .content(rs.getString("content"))
                .publishedDate(rs.getDate("published_at"))
                .sourceName(rs.getString("name"))
                .authorName(rs.getString("first_name") + " " + rs.getString("last_name"))
                .imageUrl(rs.getString("image_url"))
                .authorId(rs.getInt("author_id"))
                .sourceId(rs.getInt("new.source_id"))
                .build();

        return newDto;
    }
}
