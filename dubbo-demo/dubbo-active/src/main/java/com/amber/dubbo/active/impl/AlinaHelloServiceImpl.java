package com.amber.dubbo.active.impl;

import com.amber.dubbo.active.HelloService;
import org.apache.dubbo.common.extension.Activate;

@Activate(group = "class_2")
public class AlinaHelloServiceImpl implements HelloService {


    @Override
    public String sayHello() {
        System.out.println("alina dubbo spi say hello!");
        return "alina";
    }
}
