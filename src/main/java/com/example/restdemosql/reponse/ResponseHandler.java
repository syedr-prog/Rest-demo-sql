package com.example.restdemosql.reponse;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.HashMap;
import java.util.Map;
// This is how you get custom reopnses
public class ResponseHandler {
    //object: the reponse coming from databse
    public static ResponseEntity<Object> responseBuilder(
            String message, HttpStatus httpStatus, Object reponseObject
    ){
        Map<String, Object > response = new HashMap<>();
        response.put("message", message);
        response.put("httpStatus", httpStatus);
        response.put("data", reponseObject);

        return new ResponseEntity<>(response, httpStatus);
    }

}
