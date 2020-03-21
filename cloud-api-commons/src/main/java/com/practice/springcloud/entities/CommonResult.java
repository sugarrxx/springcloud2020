package com.practice.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author lixiaoxiang
 * @date 2020-03-21
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult<T> {

    private Integer code;

    private String message;

    private T data;

    public CommonResult(Integer code, String message) {
        this(code, message, null);
    }
}
