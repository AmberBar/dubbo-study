package com.amber.jdk;

import java.util.ServiceLoader;

public class JdkSpiTest {
    public static void main(String[] args) {
        ServiceLoader<HelloService> load = ServiceLoader.load(HelloService.class);
        for (HelloService helloService : load) {
            helloService.sayHello();
        }
    }
}
