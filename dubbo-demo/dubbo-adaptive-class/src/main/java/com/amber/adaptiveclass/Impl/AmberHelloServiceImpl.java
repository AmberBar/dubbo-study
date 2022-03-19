package com.amber.adaptiveclass.Impl;

import com.amber.adaptiveclass.HelloService;
import org.apache.dubbo.common.URL;

public class AmberHelloServiceImpl implements HelloService {


    @Override
    public String sayHello() {
        System.out.println("amber dubbo spi say hello!");
        return "amber";
    }
}
