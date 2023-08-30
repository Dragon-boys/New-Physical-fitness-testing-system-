package com.example.test03.dao;

import com.example.test03.bean.testReport.BaoGao;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface BaoGaoDao {
    List<BaoGao> selectBaoGao(BaoGao baoGao);

    List<BaoGao> selectById(BaoGao baoGao1);

    void batchInsert(@Param("list")List<BaoGao> baoGaoList );

}
