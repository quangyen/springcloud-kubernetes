package com.example.configclient;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

/**
 * @author brian
 * @version 1.0
 * @since 03/01/2019
 */

@Slf4j
@RestController
@RequestMapping("api")
public class ApiController {
    @Value("${foo}")
    private String foo;

    @GetMapping
    public String getData() {
        return "success";
    }

    @PostMapping
    public String postData(String data) {
        log.info(data);
        return "success";
    }

    @GetMapping("config")
    public String getConfig(){
        return foo;
    }
}
