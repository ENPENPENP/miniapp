package com.elphen.miniapp.api.service;

import com.elphen.miniapp.domain.entity.TEvent;
public interface TEventService{


    int deleteByPrimaryKey(Integer eventId,Integer fileId,String ownerId);

    int insert(TEvent record);

    int insertSelective(TEvent record);

    TEvent selectByPrimaryKey(Integer eventId,Integer fileId,String ownerId);

    int updateByPrimaryKeySelective(TEvent record);

    int updateByPrimaryKey(TEvent record);

}
