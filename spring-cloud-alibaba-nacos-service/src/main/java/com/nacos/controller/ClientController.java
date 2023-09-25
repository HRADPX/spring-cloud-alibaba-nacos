package com.nacos.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author huangran <huangran@kuaishou.com>
 * Created on 2023-09-24
 */
@RestController
@RequestMapping("/service")
public class ClientController {

    @RequestMapping("/getServiceName")
    public String bizService() {
        System.out.println("serviceName: biz-service");
        return "serviceName: biz-service";
    }
}
