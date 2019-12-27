package com.elphen.miniapp.api.mapper;

import com.elphen.miniapp.domain.entity.TEvent;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface TEventMapper {
    int deleteByPrimaryKey(@Param("eventId") Integer eventId, @Param("fileId") Integer fileId, @Param("ownerId") String ownerId);

    int insert(TEvent record);

    int insertSelective(TEvent record);

    TEvent selectByPrimaryKey(@Param("eventId") Integer eventId, @Param("fileId") Integer fileId, @Param("ownerId") String ownerId);

    int updateByPrimaryKeySelective(TEvent record);

    int updateByPrimaryKey(TEvent record);
}