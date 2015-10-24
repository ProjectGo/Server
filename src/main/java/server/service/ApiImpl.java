package server.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import server.model.User;

import java.util.ArrayList;
import java.util.List;
@Component
public class ApiImpl implements Api{
    public static final String VK_URL="https://api.vk.com/method/";
    public static final String GET_FRIENDS = "friends.get";
    public static final String FIELDS_ARE = "?fields=";
    public static final String TOKEN_IS = "&access_token=";
    public static final String API_VERSION="&version=5.8";
    String vk_token;

    private final String cliendId = "";
    private final String clientSecred ="";

    public ApiImpl() {

    }

    public ApiImpl(String access_token){
        setAccessToken(access_token);
    }

    void setAccessToken(String token){
        this.vk_token = token;
    }

    private <I, O> O sendRequest(String url, Class<O> resultObject){
        RestTemplate restTemplate = new RestTemplate();
        HttpEntity<String> entity = new HttpEntity<String>(new HttpHeaders());
        return restTemplate.exchange(url, HttpMethod.GET, entity, resultObject).getBody();

    }

//    private String executeRequest()

//    public ArrayList<User> getFriends(String fields){
//        String request = VK_URL + GET_FRIENDS + FIELDS_ARE + fields + API_VERSION + TOKEN_IS + vk_token;
//        User
//        ArrayList<User> users = new ArrayList<User>();
//        if (answer == null)
//            return users;
//
//
//
//        return users;
//    }
    @Override
    public String getAccessToken(String code) {
        String url = "https://oauth.vk.com/access_token";
        String redirectUrl = "http://projectgo-servergo.rhcloud.com/authorize";
        String params = String.format("client_id=%s&client_secret=%s&redirect_uri=%s&code=%s",
                cliendId, clientSecred, redirectUrl, code);

        return sendRequest(url + params, String.class);
    }

    @Override
    public List<Object> getFriends() {
        return null;
    }
}
