package server.controller;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.node.ObjectNode;

import java.util.ArrayList;

public class Api {
    public static final String VK_URL="https://api.vk.com/method/";
    public static final String GET_FRIENDS = "friends.get";
    public static final String FIELDS_ARE = "?fields=";
    public static final String TOKEN_IS = "&access_token=";
    public static final String API_VERSION="&version=5.8";
    String vk_token;

    public Api(String access_token){
        setAccessToken(access_token);
    }

    void setAccessToken(String token){
        this.vk_token = token;
    }

    private <I, O> O sendRequest(I request, Class<O> resultObject){
        ObjectMapper mapper = new ObjectMapper();
        try {
            String answer = sendRequest(mapper.writeValueAsString(request));
            return mapper.readValue(answer, resultObject);
        } catch (Exception ignore) { }
        return null;
    }

    public ArrayList<User> getFriends(String fields){
        String request = VK_URL + GET_FRIENDS + FIELDS_ARE + fields + API_VERSION + TOKEN_IS + vk_token;
        User
        ArrayList<User> users = new ArrayList<User>();
        if (answer == null)
            return users;



        return users;
    }
}
