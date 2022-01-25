package com.zhmenko.shiftchallengetask;

import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.*;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;

import java.util.Collections;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest
class ShiftChallengeTaskApplicationTests {
    @Autowired
    RestTemplate restTemplate;

    @Test
    void test() {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.setAccept(Collections.singletonList(MediaType.TEXT_XML));
        HttpEntity<String> entity = new HttpEntity<>("{\"a\":[{\"b\":\"c\"},{\"b\":\"d\"}]}", headers);

        ResponseEntity<String> response =
                restTemplate.postForEntity("http://localhost/api/convert", entity, String.class);

        Assert.assertTrue(response.getStatusCode() == HttpStatus.OK);
        log.info("Status code: " + response.getStatusCode());

        Assert.assertEquals("<a><b>c</b></a><a><b>d</b></a>", response.getBody());
        log.info("Response body: " + response.getBody());
    }

}