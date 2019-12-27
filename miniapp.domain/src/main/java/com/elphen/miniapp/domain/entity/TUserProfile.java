package com.elphen.miniapp.domain.entity;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class TUserProfile implements Serializable {
    /**
    * 微信用户唯一标识，openID
    */
    private String openId;

    /**
    * 用户ID，使用6位16进制数，需向用户展示
    */
    private String userId;

    /**
    * 手机号码，设置密码前必须填写手机号
    */
    private String phone;

    /**
    * 用户昵称，默认值是微信昵称
    */
    private String nickName;

    /**
    * 性别
    */
    private Integer sex;

    private static final long serialVersionUID = 1L;
}