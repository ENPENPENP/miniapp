package com.elphen.miniapp.api.service;

import com.elphen.miniapp.domain.entity.TUserGroup;
public interface TUserGroupService{


    int deleteByPrimaryKey(Integer id,String userId,Integer groupId);

    int insert(TUserGroup record);

    int insertSelective(TUserGroup record);

}
