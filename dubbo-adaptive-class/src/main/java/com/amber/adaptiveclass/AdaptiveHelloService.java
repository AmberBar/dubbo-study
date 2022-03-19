package com.amber.adaptiveclass;

import org.apache.dubbo.common.extension.Adaptive;
import org.apache.dubbo.common.extension.ExtensionLoader;

@Adaptive
public class AdaptiveHelloService implements HelloService {
    /**
     * 需要指定加载的扩展类名称
     */
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String sayHello() {
        ExtensionLoader<HelloService> extensionLoader = ExtensionLoader.getExtensionLoader(HelloService.class);
        HelloService helloService;
        if (null == name) {
            helloService = extensionLoader.getDefaultExtension();
        } else {
            helloService = extensionLoader.getExtension(name);
        }
        return helloService.sayHello();
    }
}
