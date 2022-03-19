package com.amber.dubbo.wrapper;

public class HelloServiceWrapper implements HelloService {
    HelloService helloService;

    public HelloServiceWrapper(HelloService helloService) {
        this.helloService = helloService;
    }

    @Override
    public String sayHello() {
        System.out.println("helloservice 的增强before");
        String result = helloService.sayHello();
        System.out.println("helloservice 的增强after");
        return result;
    }
}
