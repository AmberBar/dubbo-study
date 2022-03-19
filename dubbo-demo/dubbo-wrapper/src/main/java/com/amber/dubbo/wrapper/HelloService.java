package com.amber.dubbo.wrapper;

import org.apache.dubbo.common.extension.SPI;


@SPI("amber")
public interface HelloService {

     String sayHello() ;
}
