package com.amber.dubbo.Impl;

import com.amber.dubbo.HelloService;

public class AmberHelloServiceImpl implements HelloService {
    @Override
    public String sayHello() {
        System.out.println("amber dubbo spi say hello!");
        return "amber";
    }
}
