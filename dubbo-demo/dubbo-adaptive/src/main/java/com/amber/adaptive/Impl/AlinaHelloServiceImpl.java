package com.amber.adaptive.Impl;

import com.amber.adaptive.HelloService;
import org.apache.dubbo.common.URL;

public class AlinaHelloServiceImpl implements HelloService {


    @Override
    public String sayHello(URL url) {
        System.out.println("alina dubbo spi say hello!");
        return "alina";
    }
}
