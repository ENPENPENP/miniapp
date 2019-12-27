package com.elphen.miniapp.api.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.elphen.miniapp.domain.entity.TUserProfile;
import com.elphen.miniapp.api.mapper.TUserProfileMapper;
import com.elphen.miniapp.api.service.TUserProfileService;
@Service
public class TUserProfileServiceImpl implements TUserProfileService{

    @Resource
    private TUserProfileMapper tUserProfileMapper;

    @Override
    public int deleteByPrimaryKey(String openId,String userId) {
        return tUserProfileMapper.deleteByPrimaryKey(openId,userId);
    }

    @Override
    public int insert(TUserProfile record) {
        return tUserProfileMapper.insert(record);
    }

    @Override
    public int insertSelective(TUserProfile record) {
        return tUserProfileMapper.insertSelective(record);
    }

    @Override
    public TUserProfile selectByPrimaryKey(String openId,String userId) {
        return tUserProfileMapper.selectByPrimaryKey(openId,userId);
    }

    @Override
    public int updateByPrimaryKeySelective(TUserProfile record) {
        return tUserProfileMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(TUserProfile record) {
        return tUserProfileMapper.updateByPrimaryKey(record);
    }

}
