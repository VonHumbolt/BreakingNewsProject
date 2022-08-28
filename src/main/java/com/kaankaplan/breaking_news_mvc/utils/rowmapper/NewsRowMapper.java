package com.kaankaplan.breaking_news_mvc.utils.rowmapper;

import com.kaankaplan.breaking_news_mvc.models.New;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class NewsRowMapper implements RowMapper<New> {
    @Override
    public New mapRow(ResultSet rs, int rowNum) throws SQLException {

        New news = New.builder()
                .id(rs.getInt("id"))
                .title(rs.getString("title"))
                .subtitle(rs.getString("subtitle"))
                .content(rs.getString("content"))
                .publishedAt(rs.getDate("published_at"))
                .build();

        return news;
    }
}
