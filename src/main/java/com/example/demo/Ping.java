package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Ping {

    @Value("${api.version}")
    String version;

    @GetMapping(value = "/ping")
    public ResponseEntity<ResponseDto> ping() {

        ResponseDto response = new ResponseDto();
        response.setHealth("OK");
        response.setVersion(version);
        response.setMessage("Pong");

        return ResponseEntity.ok(response);
    }
}
