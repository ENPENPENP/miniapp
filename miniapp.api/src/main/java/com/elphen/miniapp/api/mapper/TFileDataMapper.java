package com.elphen.miniapp.api.mapper;

import com.elphen.miniapp.domain.entity.TFileData;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TFileDataMapper {
    int deleteByPrimaryKey(@Param("fileId") Integer fileId, @Param("rowIndex") Integer rowIndex);

    int insert(TFileData record);

    int insertSelective(TFileData record);

    TFileData selectByPrimaryKey(@Param("fileId") Integer fileId, @Param("rowIndex") Integer rowIndex);

    int updateByPrimaryKeySelective(TFileData record);

    int updateByPrimaryKey(TFileData record);
}