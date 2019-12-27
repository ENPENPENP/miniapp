package com.elphen.miniapp.api.controller;

import cn.binarywang.wx.miniapp.api.WxMaService;
import cn.binarywang.wx.miniapp.bean.WxMaJscode2SessionResult;
import com.alibaba.fastjson.JSON;
import com.elphen.common.dto.LoginDto;
import me.chanjar.weixin.common.error.WxErrorException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;


/**
 * 用户控制层
 */
@RestController
@RequestMapping("${api.v1.prefix}/user")
public class UserController {

    @Autowired
    private WxMaService wxMaService;

    /**
     * 获取用户信息（openid，sessionKey）
     * @param code
     * @return
     * @throws WxErrorException
     */
    @GetMapping(value = "info")
    public LoginDto login(String code) {
        LoginDto loginDto = null;
        Map<String, String> userInfo = new HashMap<>();
        try {
            WxMaJscode2SessionResult sessionInfo = wxMaService.getUserService().getSessionInfo(code);
            userInfo.put("openid",sessionInfo.getOpenid());
            userInfo.put("sessionKey",sessionInfo.getSessionKey());
            loginDto = LoginDto.ok("ok",userInfo);
        }catch (Exception e){
            e.printStackTrace();
            loginDto = LoginDto.fail(e.getMessage());
        }
        return loginDto;
    }
}
