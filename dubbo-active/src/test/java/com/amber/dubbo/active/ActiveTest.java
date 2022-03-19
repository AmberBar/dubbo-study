package com.amber.dubbo.active;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.ExtensionLoader;
import org.junit.Test;

import java.util.List;

public class ActiveTest {

    /**
     * Group 和 value是或的关系
     */
    @Test
    public void wrapper() {
        ExtensionLoader<HelloService> extensionLoader = ExtensionLoader.getExtensionLoader(HelloService.class);
        URL url = URL.valueOf("xxx://com.amber");
        /**
         * 激活一组
         * alina dubbo spi say hello!
         * amber dubbo spi say hello!
         */
        List<HelloService> class_2_group = extensionLoader.getActivateExtension(url, "", "class_2");
        class_2_group.forEach(HelloService::sayHello);

        /**
         * alina dubbo spi say hello!
         * jack dubbo spi say hello!
         * tony dubbo spi say hello!
         */
        List<HelloService> class_2GroupValue = extensionLoader.getActivateExtension(url, "amber", "class_1");
        class_2GroupValue.forEach(HelloService::sayHello);
    }
}
