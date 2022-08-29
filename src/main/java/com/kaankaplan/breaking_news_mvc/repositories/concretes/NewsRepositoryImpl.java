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

        String sql = "SELECT * FROM new order by published_at desc";

        return jdbcTemplate.query(sql, new NewsRowMapper());
    }

    @Override
    public New getNewsById(int newsId) {

        String sql = "SELECT * FROM new where id=" + newsId;

        return jdbcTemplate.queryForObject(sql, New.class);
    }

    @Override
    public List<New> getNewsBySourceId(int sourceId) {

        String sql = "SELECT * FROM new WHERE source_id=" + sourceId + " order by published_at desc";

        return jdbcTemplate.query(sql, new NewsRowMapper());
    }

    @Override
    public List<New> searchNew(String text) {

        String sql = "SELECT * FROM new WHERE title LIKE '%" + text + "%' or " +
                        "subtitle LIKE '%" + text + "%' or " +
                        "content LIKE '%" + text + "%' ORDER BY published_at desc";

        return jdbcTemplate.query(sql, new NewsRowMapper());
    }
}
