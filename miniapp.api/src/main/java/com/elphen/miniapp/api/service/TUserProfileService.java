package com.elphen.miniapp.api.service;

import com.elphen.miniapp.domain.entity.TUserProfile;
public interface TUserProfileService{


    int deleteByPrimaryKey(String openId,String userId);

    int insert(TUserProfile record);

    int insertSelective(TUserProfile record);

    TUserProfile selectByPrimaryKey(String openId,String userId);

    int updateByPrimaryKeySelective(TUserProfile record);

    int updateByPrimaryKey(TUserProfile record);

}
