package com.amber.dubbo.wrapper.impl;


import com.amber.dubbo.wrapper.HelloService;

public class AmberHelloServiceImpl implements HelloService {


    @Override
    public String sayHello() {
        System.out.println("amber dubbo spi say hello!");
        return "amber";
    }
}
