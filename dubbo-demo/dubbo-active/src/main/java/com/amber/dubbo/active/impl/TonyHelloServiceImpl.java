package com.amber.dubbo.active.impl;

import com.amber.dubbo.active.HelloService;
import org.apache.dubbo.common.extension.Activate;

@Activate(group = "class_1")
public class TonyHelloServiceImpl implements HelloService {


    @Override
    public String sayHello() {
        System.out.println("tony dubbo spi say hello!");
        return "tony";
    }
}
