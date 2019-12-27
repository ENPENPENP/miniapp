package com.elphen.common.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

/**
 * 用户登录返回数据传输层
 */
@Data
public class LoginDto implements Serializable {
    /**
     * 状态码成功
     */
    public static final Integer OK = 1;
    /**
     * 状态码失败
     */
    public static final Integer FAIL = -1;

    /**
     * 用户信息集合
     */
    private Map data;

    /**
     * 错误信息
     */
    private String errMsg;

    /**
     * 状态吗
     */
    private Integer statusCode;

    /**
     * 获取登录信息成功
     * @param errMsg
     * @param data
     * @return
     */
    public static LoginDto ok(String errMsg, Map data){
        LoginDto loginDto = new LoginDto();
        loginDto.setData(data);
        loginDto.setErrMsg(errMsg);
        loginDto.setStatusCode(OK);
        return loginDto;
    }

    /**
     * 获取登录信息失败
     * @param errMsg
     * @return
     */
    public static LoginDto fail(String errMsg){
        LoginDto loginDto = new LoginDto();
        loginDto.setData(null);
        loginDto.setErrMsg(errMsg);
        loginDto.setStatusCode(FAIL);
        return loginDto;
    }
}
