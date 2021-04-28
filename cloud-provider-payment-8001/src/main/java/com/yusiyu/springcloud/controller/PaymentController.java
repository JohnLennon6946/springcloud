package com.yusiyu.springcloud.controller;

import com.yusiyu.springcloud.entities.CommonResult;
import com.yusiyu.springcloud.entities.Payment;
import com.yusiyu.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@Slf4j
public class PaymentController {
    @Resource
    private PaymentService paymentService;

    @PostMapping(value = "/payment/create")
    public CommonResult create(Payment payment){
        int result=paymentService.create(payment);
        log.info("*******8插入结果"+result);

        if(result>0){
            return new CommonResult(200,"插入数据库成功",result);

        }else {
            return new CommonResult(404,"插入数据库失败",null);
        }
    }


    @GetMapping(value = "/payment/findById/{id}")
    public CommonResult findById(@PathVariable("id")Long id){
        Payment payment=paymentService.findById(id);
        if(payment!=null){
            return new CommonResult(200,"查询成功",payment);

        }else {
            return new CommonResult(404,"查询失败，无"+id+"记录",null);
        }
    }
}
