package com.demo.gatewayservice;

import com.netflix.discovery.shared.Application;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
@EnableDiscoveryClient
public class DemoGateWayService {
    public static void main(String...args){
        SpringApplication.run(DemoGateWayService.class,args);
    }
}
