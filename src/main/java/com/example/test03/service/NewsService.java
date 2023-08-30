package com.example.test03.service;

import com.example.test03.bean.news.News;

import java.util.List;

public interface NewsService {
    List<News> selectBatch(List<Long> id);
    int insertBatch(List<News> news);

    int updateBatch(List<News> news);

    int deleteBatch(List<Long> news);
}
