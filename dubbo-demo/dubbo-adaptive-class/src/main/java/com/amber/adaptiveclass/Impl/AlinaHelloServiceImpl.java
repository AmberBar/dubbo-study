package com.amber.adaptiveclass.Impl;

import com.amber.adaptiveclass.HelloService;
import org.apache.dubbo.common.URL;

public class AlinaHelloServiceImpl implements HelloService {


    @Override
    public String sayHello() {
        System.out.println("alina dubbo spi say hello!");
        return "alina";
    }
}
