package com.amber.jdk.impl;

import com.amber.jdk.HelloService;


public class AmberHelloServiceImpl implements HelloService {
    @Override
    public void sayHello() {
        System.out.println("amber say hello!");
    }
}
