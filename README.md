# 学习设计模式
## 一、设计模式的六大原则
* 单一职责原则：一个类只做一件事情。
* 里式替换原则：派生类（子类）可以替换基类（父类）
* 依赖倒置原则：就是依赖抽象开发，不依赖与具体实现开发。
* 接口隔离原则：不依赖不需要的接口，类间的依赖关系应该建立在最小的接口上。
* 开闭原则：对扩展开放、对修改关闭。
* 迪米特法则：

## 二、自己的理解
### 2.1 里式替换原则与依赖倒置原则的组合。
``` java
/**
 * IService：接口
 *      AService实现
 *      BService实现
 */
private IService service;

/**
 * private IService service;该为private AService service;
 * 那么对method方法更类似是AService的一个方法。
 * 
 * 如果是private IService service;
 * 可以更具策略模式，根据不同的条件注入不同IService的实现类。
 * 方法更加通用。
 */
public void method() {
    service.operator();
}

```
### 2.2 开闭原则
* 使用接口或者抽象类进行约束，private IService service;就要求service必须是IService的实现类，非常
类似泛型中的extends、super等。
* 