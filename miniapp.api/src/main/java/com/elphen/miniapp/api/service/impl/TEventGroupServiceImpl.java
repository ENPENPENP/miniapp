package com.elphen.miniapp.api.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.elphen.miniapp.api.mapper.TEventGroupMapper;
import com.elphen.miniapp.domain.entity.TEventGroup;
import com.elphen.miniapp.api.service.TEventGroupService;
@Service
public class TEventGroupServiceImpl implements TEventGroupService{

    @Resource
    private TEventGroupMapper tEventGroupMapper;

    @Override
    public int deleteByPrimaryKey(Integer id,Integer eventId,Integer groupId) {
        return tEventGroupMapper.deleteByPrimaryKey(id,eventId,groupId);
    }

    @Override
    public int insert(TEventGroup record) {
        return tEventGroupMapper.insert(record);
    }

    @Override
    public int insertSelective(TEventGroup record) {
        return tEventGroupMapper.insertSelective(record);
    }

    @Override
    public TEventGroup selectByPrimaryKey(Integer id,Integer eventId,Integer groupId) {
        return tEventGroupMapper.selectByPrimaryKey(id,eventId,groupId);
    }

    @Override
    public int updateByPrimaryKeySelective(TEventGroup record) {
        return tEventGroupMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(TEventGroup record) {
        return tEventGroupMapper.updateByPrimaryKey(record);
    }

}
