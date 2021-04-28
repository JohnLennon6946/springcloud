package com.yusiyu.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {
    //404 not found
    private Integer code;
    private String massage;
    private T data;

    public CommonResult(Integer code, String massage) {
        this.code = code;
        this.massage = massage;
    }
}
