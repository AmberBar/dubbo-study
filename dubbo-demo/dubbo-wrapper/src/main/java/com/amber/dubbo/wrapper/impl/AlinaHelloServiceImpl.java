package com.amber.dubbo.wrapper.impl;

;
import com.amber.dubbo.wrapper.HelloService;

public class AlinaHelloServiceImpl implements HelloService {


    @Override
    public String sayHello() {
        System.out.println("alina dubbo spi say hello!");
        return "alina";
    }
}
