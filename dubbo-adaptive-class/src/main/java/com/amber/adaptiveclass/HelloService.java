package com.amber.adaptiveclass;

import org.apache.dubbo.common.extension.SPI;


@SPI("amber")
public interface HelloService {

     String sayHello() ;
}
