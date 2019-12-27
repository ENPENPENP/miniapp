package com.elphen.miniapp.api.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.elphen.miniapp.api.mapper.TGroupMapper;
import com.elphen.miniapp.domain.entity.TGroup;
import com.elphen.miniapp.api.service.TGroupService;
@Service
public class TGroupServiceImpl implements TGroupService{

    @Resource
    private TGroupMapper tGroupMapper;

    @Override
    public int deleteByPrimaryKey(Integer groupId,String groupOwnerId) {
        return tGroupMapper.deleteByPrimaryKey(groupId,groupOwnerId);
    }

    @Override
    public int insert(TGroup record) {
        return tGroupMapper.insert(record);
    }

    @Override
    public int insertSelective(TGroup record) {
        return tGroupMapper.insertSelective(record);
    }

    @Override
    public TGroup selectByPrimaryKey(Integer groupId,String groupOwnerId) {
        return tGroupMapper.selectByPrimaryKey(groupId,groupOwnerId);
    }

    @Override
    public int updateByPrimaryKeySelective(TGroup record) {
        return tGroupMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(TGroup record) {
        return tGroupMapper.updateByPrimaryKey(record);
    }

}
