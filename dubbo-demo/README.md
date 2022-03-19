# Dubbo内核
dubbo内核主要提供了一下四个机制
* dubbo SPI:在jdk的基础上进行了改良，jdk spi不支持懒加载
* adaptive 自适应机制
* wrapper 包装机制
* active 激活机制

# SPI
## JDK SPI
### 缺点
不能实现懒加载

## Dubbo SPI

Dubbo 并没有直接使用 JDK 的 SPI，而是在其基础之上对其进行了改进。
### 规范
* 提供类加载者ExtensionLoader，相当于JDK中的ServiceLoader 
* 接口名随意定义 
* 配置文件内容:
  * 配置文件名称: 接口的全限定类名
  * 需要提供一个前缀，组成key=value的形式，一般key都用实现类名的首字母小写 
* 加载地址按照以下先后顺序
```
META-INF/dubbo/internal
META-INF/dubbo
META-INF/services
```

# 激活机制Active


