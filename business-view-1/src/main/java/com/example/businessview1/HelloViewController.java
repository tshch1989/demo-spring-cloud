package com.example.businessview1;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.RequestContextHolder;

@RestController
@Slf4j
public class HelloViewController {

    @Autowired
    private HelloService helloService;

    @GetMapping("/hello/echo")
    public String echo(@RequestParam String msg){
        log.info("echo params {}", msg);
        String echo = helloService.echo(msg);
        return "Hello, " + echo +"!";
    }

}
