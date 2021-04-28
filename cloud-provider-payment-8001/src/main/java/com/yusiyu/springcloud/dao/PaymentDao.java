package com.yusiyu.springcloud.dao;

import com.yusiyu.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper   //推荐使用
public interface PaymentDao {
    //查
    public Payment findById(@Param("id") Long id);

    //增
    public int create(Payment payment);
}
