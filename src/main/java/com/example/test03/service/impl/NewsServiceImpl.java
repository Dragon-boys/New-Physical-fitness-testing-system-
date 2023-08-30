package com.example.test03.service.impl;

import com.example.test03.bean.news.News;
import com.example.test03.dao.NewsDao;
import com.example.test03.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NewsServiceImpl implements NewsService {

    @Autowired
    private NewsDao newsDao;
    @Override
    public List<News> selectBatch(List<Long> id) {
        List<News> select = newsDao.selectBatch(id);
        return select;
    }

    @Override
    public int insertBatch(List<News> news) {
        return newsDao.insertBatch(news);
    }

    @Override
    public int updateBatch(List<News> news) {
        return newsDao.updateBatch(news);
    }

    @Override
    public int deleteBatch(List<Long> news) {
        return newsDao.deleteBatch(news);
    }
}
