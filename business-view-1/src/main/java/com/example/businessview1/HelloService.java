package com.example.businessview1;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(
        contextId = "HelloService",
        name = "business-service-1"
)
public interface HelloService {

    @PostMapping(
            path = "/hello/echo",
            consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE
    )
    String echo(@RequestParam("echo") String echo);

}
