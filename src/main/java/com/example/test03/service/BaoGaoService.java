package com.example.test03.service;

import com.example.test03.bean.testReport.BaoGao;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BaoGaoService {
    List<BaoGao> selectBaoGaoService(BaoGao baoGao);

    List<BaoGao> selectById(BaoGao baoGao);

    void batchInsert(@Param("list")List<BaoGao> baoGaoList );

}
