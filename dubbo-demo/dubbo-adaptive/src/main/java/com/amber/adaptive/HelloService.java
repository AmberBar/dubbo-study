package com.amber.adaptive;


import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.Adaptive;

import org.apache.dubbo.common.extension.SPI;


@SPI("amber")
public interface HelloService {
     @Adaptive
     String sayHello(URL url) ;
}
