package com.wxy.demo.core;

import lombok.Data;

/**
 * @Author wangxy
 * @Date 2019/6/20 23:16
 * @Description 公共响应对象
 **/
@Data
public class CommonResponse {
    /**
     * 状态码
     */
    private Integer code;
    /**
     * 响应信息
     */
    private String message;
    /**
     * 响应数据
     */
    private Object data;

    public CommonResponse() {
    }

    public CommonResponse(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public CommonResponse(Integer code, String message, Object data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }
}
