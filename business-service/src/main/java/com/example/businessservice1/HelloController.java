package com.example.businessservice1;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class HelloController {

    @PostMapping("/hello/echo")
    public String echo(String echo){
      log.info("接收到信息: {}", echo);
      return echo;
    }

}
