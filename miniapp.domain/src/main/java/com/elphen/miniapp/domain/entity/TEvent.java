package com.elphen.miniapp.domain.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class TEvent implements Serializable {
    /**
     * 事件的唯一标识，自增ID
     */
    private Integer eventId;

    /**
     * 事件对应的（excel表格）文件ID，不为空
     */
    private Integer fileId;

    /**
     * 事件发起用户的ID，不为空
     */
    private String ownerId;

    /**
     * 是否为私有事件，1 为 true ,0 为 false (默认值)，不为空
     */
    private Boolean isPrivate;

    /**
     * 事件是否已经结束，1 为 true ,0 为 false (默认值)，不为空
     */
    private Boolean isStoped;

    /**
     * 事件创建时间，不为空
     */
    private Date createTime;

    /**
     * 事件更新时间，不为空
     */
    private Date updateTime;

    private static final long serialVersionUID = 1L;
}