package com.amber.dubbo.active.impl;

import com.amber.dubbo.active.HelloService;
import org.apache.dubbo.common.extension.Activate;

@Activate(group = "class_1")
public class JackHelloServiceImpl implements HelloService {


    @Override
    public String sayHello() {
        System.out.println("jack dubbo spi say hello!");
        return "jack";
    }
}
