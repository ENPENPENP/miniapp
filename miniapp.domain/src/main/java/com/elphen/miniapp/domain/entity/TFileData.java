package com.elphen.miniapp.domain.entity;

import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class TFileData implements Serializable {
    /**
    * 文件ID
    */
    private Integer fileId;

    /**
    * 当前行数据在格文件中的行索引
    */
    private Integer rowIndex;

    /**
    * 编辑用户的ID
    */
    private String userId;

    /**
    * 行类型，1 为表头， 0 为表数据， -1 为页脚
    */
    private Integer rowType;

    /**
    * 行数据，json格式
    */
    private Object rowData;

    private static final long serialVersionUID = 1L;
}