package com.example.test03.dao;

import com.example.test03.bean.news.News;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface NewsDao {
    List<News> selectBatch(List<Long> id);

    int insertBatch(List<News> news);

    int updateBatch(List<News> news);

    int deleteBatch(List<Long> news);
}
