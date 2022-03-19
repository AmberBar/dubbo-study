package com.amber.adaptiveclass;


import org.apache.dubbo.common.extension.ExtensionLoader;
import org.junit.Test;

public class DubboAdaptiveClassTest {

    /**
     * alina dubbo spi say hello!
     */
    @Test
    public void testAdaptiveDefault() {
        ExtensionLoader<HelloService> extensionLoader = ExtensionLoader.getExtensionLoader(HelloService.class);

        HelloService adaptiveExtension = extensionLoader.getAdaptiveExtension();
        adaptiveExtension.sayHello();
    }

    @Test
    public void testAdaptiveByName() {
        ExtensionLoader<HelloService> extensionLoader = ExtensionLoader.getExtensionLoader(HelloService.class);

        HelloService adaptiveExtension = extensionLoader.getAdaptiveExtension();
        ((AdaptiveHelloService)adaptiveExtension).setName("alina");
        adaptiveExtension.sayHello();
    }
}
