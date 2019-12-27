package com.elphen.miniapp.api.mapper;

import com.elphen.miniapp.domain.entity.TGroup;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TGroupMapper {
    int deleteByPrimaryKey(@Param("groupId") Integer groupId, @Param("groupOwnerId") String groupOwnerId);

    int insert(TGroup record);

    int insertSelective(TGroup record);

    TGroup selectByPrimaryKey(@Param("groupId") Integer groupId, @Param("groupOwnerId") String groupOwnerId);

    int updateByPrimaryKeySelective(TGroup record);

    int updateByPrimaryKey(TGroup record);
}