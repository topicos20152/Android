package com.topicos.topicosandroid.api;

import com.topicos.topicosandroid.domain.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by Pablo Gabriel on 15/11/2015.
 */
public class Auth {

    private String accessToken;
    private String expireDate;

    public Auth() {
    }

    private List<Map<String, String>> getCredential(User user) {
        List<Map<String, String>> credential = null;
        try {
            credential = new ApiRequest("users/" + user.getId() + "/request_access_token", "POST", keys()).execute().get();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return credential;
    }

    public String getAccessToken(User user) {
        Map<String, String> map = getCredential(user).get(0);
        return map.get(ACCESS_TOKEN);
    }

    public String getExpireDate(User user) {
        Map<String, String> map = getCredential(user).get(0);
        return map.get(EXPIRE_DATE);
    }

    public static List<String> keys() {
        List<String> keys = new ArrayList<String>();
        keys.add("value");
        keys.add("expire_date");

        return keys;
    }

    public static final String ACCESS_TOKEN = "value";
    public static final String EXPIRE_DATE = "expire_date";

}
