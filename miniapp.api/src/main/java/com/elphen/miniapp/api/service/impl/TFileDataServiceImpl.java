package com.elphen.miniapp.api.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import com.elphen.miniapp.api.mapper.TFileDataMapper;
import com.elphen.miniapp.domain.entity.TFileData;
import com.elphen.miniapp.api.service.TFileDataService;
@Service
public class TFileDataServiceImpl implements TFileDataService{

    @Resource
    private TFileDataMapper tFileDataMapper;

    @Override
    public int deleteByPrimaryKey(Integer fileId,Integer rowIndex) {
        return tFileDataMapper.deleteByPrimaryKey(fileId,rowIndex);
    }

    @Override
    public int insert(TFileData record) {
        return tFileDataMapper.insert(record);
    }

    @Override
    public int insertSelective(TFileData record) {
        return tFileDataMapper.insertSelective(record);
    }

    @Override
    public TFileData selectByPrimaryKey(Integer fileId,Integer rowIndex) {
        return tFileDataMapper.selectByPrimaryKey(fileId,rowIndex);
    }

    @Override
    public int updateByPrimaryKeySelective(TFileData record) {
        return tFileDataMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(TFileData record) {
        return tFileDataMapper.updateByPrimaryKey(record);
    }

}
