package com.demo;

import org.json.JSONException;
import org.json.JSONObject;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

class ApplicationTests {

    private static final String localhost = "http://127.0.0.1:9292/";

    @Test
    void call() throws JSONException {
        String shop = "Caruso pizza";
        given().baseUri(localhost)
               .contentType("application/json\r\n")
               .log().all()
               .body(getJson())
               .post(String.format("order/%s", shop))
               .prettyPrint();
    }

    private static String getJson() throws JSONException {
        JSONObject requestParams = new JSONObject();
        requestParams.put("name", "pizza");
        requestParams.put("qty", "2");
        requestParams.put("price", "7");
        return requestParams.toString();
    }

}
