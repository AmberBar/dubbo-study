package com.amber.dubbo.active;

import org.apache.dubbo.common.extension.SPI;


@SPI("amber")
public interface HelloService {

     String sayHello() ;
}
