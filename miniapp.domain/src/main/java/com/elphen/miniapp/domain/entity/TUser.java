package com.elphen.miniapp.domain.entity;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class TUser implements Serializable {
    /**
    * 用户ID
    */
    private String userId;

    /**
    * 密码，第一次创建账号使用微信授权，用户可在设置中修改
    */
    private String password;

    private static final long serialVersionUID = 1L;
}