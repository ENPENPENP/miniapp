package com.elphen.miniapp.api.mapper;

import com.elphen.miniapp.domain.entity.TFileInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TFileInfoMapper {
    int deleteByPrimaryKey(@Param("fileId") Integer fileId, @Param("fileName") String fileName);

    int insert(TFileInfo record);

    int insertSelective(TFileInfo record);

    TFileInfo selectByPrimaryKey(@Param("fileId") Integer fileId, @Param("fileName") String fileName);

    int updateByPrimaryKeySelective(TFileInfo record);

    int updateByPrimaryKey(TFileInfo record);
}