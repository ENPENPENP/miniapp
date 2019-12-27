package com.elphen.miniapp.api.mapper;

import com.elphen.miniapp.domain.entity.TUserMsg;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TUserMsgMapper {
    int deleteByPrimaryKey(@Param("id") Integer id, @Param("userId") String userId, @Param("message") String message);

    int insert(TUserMsg record);

    int insertSelective(TUserMsg record);

    TUserMsg selectByPrimaryKey(@Param("id") Integer id, @Param("userId") String userId, @Param("message") String message);

    int updateByPrimaryKeySelective(TUserMsg record);

    int updateByPrimaryKey(TUserMsg record);
}