package com.elphen.miniapp.domain.entity;

import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class TFileInfo implements Serializable {
    /**
    * 文件ID，自增ID
    */
    private Integer fileId;

    /**
    * 文件名，不为空
    */
    private String fileName;

    /**
    * 文件总行数
    */
    private Integer rowCount;

    /**
    * 排序列的索引值，默认 0 （第一列），不为空
    */
    private Integer orderIndex;

    /**
    * 排序类型，1为 ASC (默认值)，0为 DESC ，默认值为 1，不为空
    */
    private Boolean orderType;

    /**
    * 是否生成硬盘文件，1 为已生成， 0 为未生成(默认值)， 不为空
    */
    private Boolean isGenerated;

    /**
    * 硬盘文件路径
    */
    private String filePath;

    /**
    * 创建时间，不为空
    */
    private Date createTime;

    /**
    * 上次更新时间，不为空
    */
    private Date updateTime;

    private static final long serialVersionUID = 1L;
}