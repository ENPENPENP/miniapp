package com.elphen.miniapp.api.service;

import com.elphen.miniapp.domain.entity.TGroup;
public interface TGroupService{


    int deleteByPrimaryKey(Integer groupId,String groupOwnerId);

    int insert(TGroup record);

    int insertSelective(TGroup record);

    TGroup selectByPrimaryKey(Integer groupId,String groupOwnerId);

    int updateByPrimaryKeySelective(TGroup record);

    int updateByPrimaryKey(TGroup record);

}
