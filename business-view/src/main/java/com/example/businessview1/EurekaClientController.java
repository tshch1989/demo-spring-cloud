package com.example.businessview1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.stream.Collectors;

@RestController
public class EurekaClientController {

    @Autowired
    private DiscoveryClient discoveryClient;

    @GetMapping("/test/test")
    public Object test(){
        return discoveryClient.getServices().stream()
                .map(m->discoveryClient.getInstances(m))
                .collect(Collectors.toSet());
    }

}
