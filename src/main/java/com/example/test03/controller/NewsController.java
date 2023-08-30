package com.example.test03.controller;

import com.example.test03.bean.news.News;
import com.example.test03.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class NewsController {
    @Autowired
    private NewsService newsService;

    /**
     * 根据id数组查询数据
     * @param id
     * @return
     * 数组形式增删改查
     */
    @PostMapping("/news/selectBatch")
    public List<News> select(@RequestBody List<Long> id){
        return newsService.selectBatch(id);
    }

    @PostMapping("/news/insertBatch")
    public int insertBatch(@RequestBody List<News> news){
        return newsService.insertBatch(news);
    }
    @PostMapping("/news/updateBatch")
    public int updateBatch(@RequestBody List<News> news){
        return newsService.updateBatch(news);
    }
    @PostMapping("/news/deleteBatch")
    public int deleteBatch(@RequestBody List<Long> news){
        return newsService.deleteBatch(news);
    }
}
