package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PingTest {

    private Ping resource = new Ping();

    @Test
    public void cuandoSeHacePingRespondePong() {

        ResponseEntity<String> pong = resource.ping();

        assert pong.getBody() != null;
        assert pong.getBody().equals("Pong");
    }
}
