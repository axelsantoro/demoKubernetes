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
    public void cuandoSeHacePingRespondeElMensajePong() {

        ResponseEntity<ResponseDto> pong = resource.ping();

        assert pong.getBody() != null;
        assert pong.getBody().getMessage().equals("Pong");
        assert pong.getBody().getHealth().equals("OK");
    }
}
