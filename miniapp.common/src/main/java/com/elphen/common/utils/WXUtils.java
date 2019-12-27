package com.elphen.common.utils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.apache.commons.lang3.StringUtils;
import org.apache.http.HttpEntity;
import org.apache.http.HttpStatus;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class WXUtils {

    private static String GRANT_TYPE = "authorization_code";

    private static Logger logger = LoggerFactory.getLogger(WXUtils.class);

    /**
     * 生成接口url
     *
     * @param appid  appid
     * @param secret secret
     * @param code   前端获取的用户的code
     * @return
     */
    public static String setUrlParam(String appid, String secret, String code) {
        StringBuffer Url = new StringBuffer("https://api.weixin.qq.com/sns/jscode2session");
        String params = "?appid=" + appid + "&secret=" + secret + "&js_code=" + code + "&grant_type=" + GRANT_TYPE;
        Url.append(params);
        System.out.println(Url);
        return Url.toString();
    }

    /**
     * 使用微信接口获取用户信息
     *
     * @param appid
     * @param secret
     * @param code
     * @return
     */
    public static Map<String, String> requestSessionIdAndOpenId(String appid, String secret, String code) {
        if (StringUtils.isBlank(code)) {
            logger.debug("code is null!");
        }
        if(StringUtils.isBlank(appid)){
            logger.debug("appId is null!");
        }
        if (StringUtils.isBlank(secret)){
            logger.debug("secret is null");
        }
        System.out.println(code);
        System.out.println(appid);
        System.out.println(secret);
        Map res = new HashMap();
        CloseableHttpClient httpClient = HttpClients.createDefault();
        HttpGet httpGet = new HttpGet(setUrlParam(appid, secret, code));
        System.out.println(httpGet.getURI());
        JSONObject jsonObject = null;
        BufferedReader bufferedReader = null;
        CloseableHttpResponse httpResponse = null;
        StringBuilder entityStringBuilder = new StringBuilder();

        try {
            // 请求并获得响应结果
            httpResponse = httpClient.execute(httpGet);
            //判断httpResponse的状态响应码
            if (httpResponse.getStatusLine().getStatusCode() == HttpStatus.SC_OK) {
                //得到httpResponse的实体数据
                HttpEntity httpEntity = httpResponse.getEntity();
                System.out.println(httpEntity);
                if (httpEntity != null) {
                    try {
                        bufferedReader = new BufferedReader
                                (new InputStreamReader(httpEntity.getContent(), "UTF-8"), 8 * 1024);
                        String line = null;
                        while ((line = bufferedReader.readLine()) != null) {
                            entityStringBuilder.append(line + "/n");
                        }
                        System.out.println(entityStringBuilder.toString());
                        //利用从HttpEntity中得到的String生成JsonObject
                        jsonObject = JSON.parseObject(entityStringBuilder.toString());
                        System.out.println(jsonObject);
                        JSONArray jsonArray = JSON.parseArray(jsonObject.toString());
                        System.out.println(jsonArray);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        // 无论如何必须关闭连接
        finally {
            if (httpResponse != null) {
                try {
                    httpResponse.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (httpClient != null) {
                try {
                    httpClient.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return null;

    }
}
