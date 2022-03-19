package adaptiveclass;



import com.amber.adaptive.HelloService;
import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.ExtensionLoader;
import org.junit.Test;

public class DubboAdaptiveTest {

    /**
     * alina dubbo spi say hello!
     */
    @Test
    public void testAdaptiveDefault() {
        ExtensionLoader<HelloService> extensionLoader = ExtensionLoader.getExtensionLoader(HelloService.class);

        URL url =  URL.valueOf("xxx://amber.test");
        HelloService adaptiveExtension = extensionLoader.getAdaptiveExtension();

        adaptiveExtension.sayHello(url);

    }

    @Test
    public void testAdaptiveByUrl() {
        ExtensionLoader<HelloService> extensionLoader = ExtensionLoader.getExtensionLoader(HelloService.class);

        URL url =  URL.valueOf("xxx://amber.test?hello=alina");
        HelloService adaptiveExtension = extensionLoader.getAdaptiveExtension();

        adaptiveExtension.sayHello(url);

    }
}
