package com.lianggzone.designpattern.decorator.template;

/**
 * ConcreteDecoratorA
 * @author 粱桂钊
 * @since 
 * <p>更新时间: 2016年3月11日  v0.1</p><p>版本内容: 创建</p>
 */
public class ConcreteDecoratorA extends Decorator{

    /*
     * ConcreteDecoratorA有一个实例变量，可以记录装饰的事物
     */
    private String remark;
    
    public ConcreteDecoratorA(Component component) {
        super(component);
        remark = "ConcreteDecoratorA 调用！";
        System.out.println(remark);
    }
}
