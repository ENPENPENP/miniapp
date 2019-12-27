package com.elphen.miniapp.api.mapper;

import com.elphen.miniapp.domain.entity.TEventGroup;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TEventGroupMapper {
    int deleteByPrimaryKey(@Param("id") Integer id, @Param("eventId") Integer eventId, @Param("groupId") Integer groupId);

    int insert(TEventGroup record);

    int insertSelective(TEventGroup record);

    TEventGroup selectByPrimaryKey(@Param("id") Integer id, @Param("eventId") Integer eventId, @Param("groupId") Integer groupId);

    int updateByPrimaryKeySelective(TEventGroup record);

    int updateByPrimaryKey(TEventGroup record);
}