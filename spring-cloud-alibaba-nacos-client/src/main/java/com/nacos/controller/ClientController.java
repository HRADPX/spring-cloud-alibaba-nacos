package com.nacos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author huangran <huangran@kuaishou.com>
 * Created on 2023-09-24
 */
@RestController
@RequestMapping("/client")
public class ClientController {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/findBizService")
    public String clientService() {
        System.out.println("findBizService");
        String url = "http://biz-service/service/getServiceName";
        return restTemplate.getForObject(url, String.class);
    }
}
