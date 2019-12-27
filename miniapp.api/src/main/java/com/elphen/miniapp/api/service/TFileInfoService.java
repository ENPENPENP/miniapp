package com.elphen.miniapp.api.service;

import com.elphen.miniapp.domain.entity.TFileInfo;
public interface TFileInfoService{


    int deleteByPrimaryKey(Integer fileId,String fileName);

    int insert(TFileInfo record);

    int insertSelective(TFileInfo record);

    TFileInfo selectByPrimaryKey(Integer fileId,String fileName);

    int updateByPrimaryKeySelective(TFileInfo record);

    int updateByPrimaryKey(TFileInfo record);

}
