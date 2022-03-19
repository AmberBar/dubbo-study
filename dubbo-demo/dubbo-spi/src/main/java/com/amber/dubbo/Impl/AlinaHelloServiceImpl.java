package com.amber.dubbo.Impl;

import com.amber.dubbo.HelloService;

public class AlinaHelloServiceImpl implements HelloService {
    @Override
    public String sayHello() {
        System.out.println("alina dubbo spi say hello!");
        return "alina";
    }
}
