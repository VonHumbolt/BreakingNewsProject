package com.kaankaplan.breaking_news_mvc.repositories.concretes;

import com.kaankaplan.breaking_news_mvc.models.dtos.NewDto;
import com.kaankaplan.breaking_news_mvc.repositories.abstarcts.NewsRepository;
import com.kaankaplan.breaking_news_mvc.utils.rowmapper.NewDtoRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class NewsRepositoryImpl implements NewsRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<NewDto> getAllNews() {

        String sql = "select * from new inner join source s on new.source_id = s.source_id inner join author a on s.source_id = a.source_id" +
                " inner join news_image ni on new.id = ni.news_id order by published_at desc";

        return jdbcTemplate.query(sql, new NewDtoRowMapper());
    }

    @Override
    public NewDto getNewsById(int newsId) {

        String sql = "select * from new inner join source s on new.source_id = s.source_id inner join author a on s.source_id = a.source_id" +
                " inner join news_image ni on new.id = ni.news_id where id=?";

        return jdbcTemplate.queryForObject(sql, new Object[]{newsId}, new NewDtoRowMapper());
    }

    @Override
    public List<NewDto> getNewsBySourceId(int sourceId) {

        String sql = "select * from new inner join source s on new.source_id = s.source_id inner join author a on s.source_id = a.source_id " +
                " inner join news_image ni on new.id = ni.news_id WHERE s.source_id=" + sourceId + " order by published_at desc";

        return jdbcTemplate.query(sql, new NewDtoRowMapper());
    }

    @Override
    public List<NewDto> getNewsByAuthorId(int authorId) {
        String sql = "select * from new inner join source s on new.source_id = s.source_id inner join author a on s.source_id = a.source_id " +
                " inner join news_image ni on new.id = ni.news_id WHERE a.author_id=" + authorId + " order by published_at desc";

        return jdbcTemplate.query(sql, new NewDtoRowMapper());
    }

    @Override
    public List<NewDto> searchNew(String text) {

        String sql = "select * from new inner join source s on new.source_id = s.source_id inner join author a on s.source_id = a.source_id" +
                        " inner join news_image ni on new.id = ni.news_id" +
                        " WHERE title LIKE '%" + text + "%' or " +
                        "subtitle LIKE '%" + text + "%' or " +
                        "content LIKE '%" + text + "%' ORDER BY published_at desc";

        return jdbcTemplate.query(sql, new NewDtoRowMapper());
    }
}
