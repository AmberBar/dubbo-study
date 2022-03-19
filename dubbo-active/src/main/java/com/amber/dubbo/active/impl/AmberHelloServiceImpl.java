package com.amber.dubbo.active.impl;


import com.amber.dubbo.active.HelloService;
import org.apache.dubbo.common.extension.Activate;

@Activate(group = "class_2", value = "amber")
public class AmberHelloServiceImpl implements HelloService {


    @Override
    public String sayHello() {
        System.out.println("amber dubbo spi say hello!");
        return "amber";
    }
}
