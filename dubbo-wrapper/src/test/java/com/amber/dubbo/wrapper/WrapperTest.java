package com.amber.dubbo.wrapper;

import org.apache.dubbo.common.extension.ExtensionLoader;
import org.junit.Test;

public class WrapperTest {

    /**
     * helloservice 的增强before
     * amber dubbo spi say hello!
     * helloservice 的增强after
     */
    @Test
    public void wrapper() {
        ExtensionLoader<HelloService> extensionLoader = ExtensionLoader.getExtensionLoader(HelloService.class);
        HelloService amber = extensionLoader.getExtension("amber");
        amber.sayHello();
    }
}
