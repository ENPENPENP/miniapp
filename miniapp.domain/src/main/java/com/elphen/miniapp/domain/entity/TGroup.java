package com.elphen.miniapp.domain.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class TGroup implements Serializable {
    /**
    * 群组ID，使用后台生成5位长度的随机数，不为空
    */
    private Integer groupId;

    /**
    * 创建用户ID，不为空
    */
    private String groupOwnerId;

    /**
    * 群组名字，不为空
    */
    private String groupName;

    /**
    * 是否为私有群组，1 为私有，0 为开放，不为空
    */
    private Boolean isPrivate;

    /**
    * 群组创建时间，不为空
    */
    private Date createTime;

    private static final long serialVersionUID = 1L;
}