package com.yusiyu.springcloud.service.impl;

import com.yusiyu.springcloud.dao.PaymentDao;
import com.yusiyu.springcloud.entities.Payment;
import com.yusiyu.springcloud.service.PaymentService;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PaymentServiceImpl implements PaymentService {
    @Resource
    private PaymentDao paymentDao;
    //查
    @Override
    public Payment findById(@Param("id") Long id){
        return paymentDao.findById(id);
    }

    //增
    @Override
    public int create(Payment payment){
        return paymentDao.create(payment);
    }
}
