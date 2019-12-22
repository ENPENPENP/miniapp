package com.elphen.miniapp.api.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.elphen.miniapp.api.mapper.TEventMapper;
import com.elphen.miniapp.domain.entity.TEvent;
import com.elphen.miniapp.api.service.TEventService;
@Service
public class TEventServiceImpl implements TEventService{

    @Resource
    private TEventMapper tEventMapper;

    @Override
    public int deleteByPrimaryKey(Integer eventId,Integer fileId,String ownerId) {
        return tEventMapper.deleteByPrimaryKey(eventId,fileId,ownerId);
    }

    @Override
    public int insert(TEvent record) {
        return tEventMapper.insert(record);
    }

    @Override
    public int insertSelective(TEvent record) {
        return tEventMapper.insertSelective(record);
    }

    @Override
    public TEvent selectByPrimaryKey(Integer eventId,Integer fileId,String ownerId) {
        return tEventMapper.selectByPrimaryKey(eventId,fileId,ownerId);
    }

    @Override
    public int updateByPrimaryKeySelective(TEvent record) {
        return tEventMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(TEvent record) {
        return tEventMapper.updateByPrimaryKey(record);
    }

}
