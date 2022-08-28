package com.kaankaplan.breaking_news_mvc.repositories.concretes;

import com.kaankaplan.breaking_news_mvc.models.New;
import com.kaankaplan.breaking_news_mvc.repositories.abstarcts.NewsRepository;
import com.kaankaplan.breaking_news_mvc.utils.rowmapper.NewsRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class NewsRepositoryImpl implements NewsRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<New> getAllNews() {

        String sql = "SELECT * FROM new";

        return jdbcTemplate.query(sql, new NewsRowMapper());
    }
}
