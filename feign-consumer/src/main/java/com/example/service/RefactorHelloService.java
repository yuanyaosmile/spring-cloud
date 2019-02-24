package com.example.service;

import com.yy.service.HelloService;
import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(value = "HELLO-SERVICE")
public interface RefactorHelloService extends HelloService {
}
