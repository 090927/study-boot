package com.custom.studyboot.auth.token;

import java.util.HashMap;
import java.util.Map;

import org.springframework.security.oauth2.common.DefaultOAuth2AccessToken;
import org.springframework.security.oauth2.common.OAuth2AccessToken;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.security.oauth2.provider.token.TokenEnhancer;

/**
 * DATE 2021-11-14
 *
 *  扩展 JWT
 *
 * @author wang
 */
public class JWTTokenEnhancer implements TokenEnhancer {


    /**
     *  jwt 增强。
     * @return
     */
    @Override
    public OAuth2AccessToken enhance(OAuth2AccessToken oAuth2AccessToken, OAuth2Authentication oAuth2Authentication) {
        Map<String, Object> systemInfo = new HashMap<>();
        systemInfo.put("system", "Appointment System");
        ((DefaultOAuth2AccessToken) oAuth2AccessToken).setAdditionalInformation(systemInfo);
        return oAuth2AccessToken;
    }
}
