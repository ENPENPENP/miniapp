package com.elphen.miniapp.api.service;

import com.elphen.miniapp.domain.entity.TEventGroup;
public interface TEventGroupService{


    int deleteByPrimaryKey(Integer id,Integer eventId,Integer groupId);

    int insert(TEventGroup record);

    int insertSelective(TEventGroup record);

    TEventGroup selectByPrimaryKey(Integer id,Integer eventId,Integer groupId);

    int updateByPrimaryKeySelective(TEventGroup record);

    int updateByPrimaryKey(TEventGroup record);

}
