package com.ma.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class HelloService {

    @Autowired
    RestTemplate restTemplate;

    public String hiService(String name) {
        //转发到service-hi服务器下
        return restTemplate.getForObject("http://SERVICE-HI/hi?name="+name,String.class);
    }

}