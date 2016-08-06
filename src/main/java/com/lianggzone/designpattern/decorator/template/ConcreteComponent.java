package com.lianggzone.designpattern.decorator.template;

/**
 * ConcreteComponent
 * @author 粱桂钊
 * @since 
 * <p>更新时间: 2016年3月11日  v0.1</p><p>版本内容: 创建</p>
 */
public class ConcreteComponent extends Component {

    /*
     * ConcreteComponent是我们将要动态的加上新行为对象
     */
    @Override
    public void execute() {
        System.out.println("ConcreteComponent method execute!");
    }
}
