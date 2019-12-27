package com.elphen.miniapp.api.mapper;

import com.elphen.miniapp.domain.entity.TUserProfile;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TUserProfileMapper {
    int deleteByPrimaryKey(@Param("openId") String openId, @Param("userId") String userId);

    int insert(TUserProfile record);

    int insertSelective(TUserProfile record);

    TUserProfile selectByPrimaryKey(@Param("openId") String openId, @Param("userId") String userId);

    int updateByPrimaryKeySelective(TUserProfile record);

    int updateByPrimaryKey(TUserProfile record);
}