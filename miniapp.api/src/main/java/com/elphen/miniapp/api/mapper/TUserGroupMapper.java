package com.elphen.miniapp.api.mapper;

import com.elphen.miniapp.domain.entity.TUserGroup;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TUserGroupMapper {
    int deleteByPrimaryKey(@Param("id") Integer id, @Param("userId") String userId, @Param("groupId") Integer groupId);

    int insert(TUserGroup record);

    int insertSelective(TUserGroup record);
}