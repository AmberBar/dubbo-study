package jdk;


import com.amber.dubbo.HelloService;
import org.apache.dubbo.common.extension.ExtensionLoader;

public class DubboSpiTest {
    public static void main(String[] args) {
        ExtensionLoader<HelloService> extensionLoader = ExtensionLoader.getExtensionLoader(HelloService.class);

        HelloService amber = extensionLoader.getExtension("amber");
        amber.sayHello();

        HelloService alina = extensionLoader.getExtension("alina");
        alina.sayHello();
    }
}
