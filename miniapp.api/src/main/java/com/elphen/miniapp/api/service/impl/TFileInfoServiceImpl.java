package com.elphen.miniapp.api.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.elphen.miniapp.api.mapper.TFileInfoMapper;
import com.elphen.miniapp.domain.entity.TFileInfo;
import com.elphen.miniapp.api.service.TFileInfoService;
@Service
public class TFileInfoServiceImpl implements TFileInfoService{

    @Resource
    private TFileInfoMapper tFileInfoMapper;

    @Override
    public int deleteByPrimaryKey(Integer fileId,String fileName) {
        return tFileInfoMapper.deleteByPrimaryKey(fileId,fileName);
    }

    @Override
    public int insert(TFileInfo record) {
        return tFileInfoMapper.insert(record);
    }

    @Override
    public int insertSelective(TFileInfo record) {
        return tFileInfoMapper.insertSelective(record);
    }

    @Override
    public TFileInfo selectByPrimaryKey(Integer fileId,String fileName) {
        return tFileInfoMapper.selectByPrimaryKey(fileId,fileName);
    }

    @Override
    public int updateByPrimaryKeySelective(TFileInfo record) {
        return tFileInfoMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(TFileInfo record) {
        return tFileInfoMapper.updateByPrimaryKey(record);
    }

}
