package com.yusiyu.springcloud.service;

import com.yusiyu.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

public interface PaymentService {
    //查
    public Payment findById(@Param("id") Long id);

    //增
    public int create(Payment payment);
}
