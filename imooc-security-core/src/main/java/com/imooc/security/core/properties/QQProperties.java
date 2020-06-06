package com.imooc.security.core.properties;

import org.springframework.boot.autoconfigure.social.SocialProperties;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

/**
 * @类名: QQProperties<br />
 * @包名：com.imooc.security.core.properties<br/>
 * @作者：kevin<br/>
 * @时间：2020/6/1 22:58<br/>
 * @版本：1.0<br/>
 * @描述：<br/>
 */
public class QQProperties extends SocialProperties {

    private String providerId = "qq";

    public String getProviderId() {
        return providerId;
    }

    public void setProviderId(String providerId) {
        this.providerId = providerId;
    }

    public static void main(String[] args) throws UnsupportedEncodingException {
        System.out.println(URLDecoder.decode("http%3A%2F%2Flocalhost%2FqqLogin%2Fcallback.do", "UTF-8"));
    }
}
