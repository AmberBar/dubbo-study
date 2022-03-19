package com.amber.adaptive.Impl;

import com.amber.adaptive.HelloService;
import org.apache.dubbo.common.URL;

public class AmberHelloServiceImpl implements HelloService {

    @Override
    public String sayHello(URL url) {
        System.out.println("amber dubbo spi say hello!");
        return "amber";
    }
}
