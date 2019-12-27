package com.elphen.miniapp.domain.entity;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class TEventGroup implements Serializable {
    /**
    * 物理自增ID
    */
    private Integer id;

    /**
    * 事件ID
    */
    private Integer eventId;

    /**
    * 群组ID
    */
    private Integer groupId;

    /**
    * 是否为所有群组成员全体事件，1 为全体事件，0 为自愿事件(默认值)
    */
    private Byte isAllUser;

    private static final long serialVersionUID = 1L;
}