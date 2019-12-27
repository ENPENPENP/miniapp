package com.elphen.miniapp.domain.entity;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class TUserGroup implements Serializable {
    /**
    * 自增ID
    */
    private Integer id;

    /**
    * 用户ID，不为空
    */
    private String userId;

    /**
    * 群组ID，不为空
    */
    private Integer groupId;

    private static final long serialVersionUID = 1L;
}