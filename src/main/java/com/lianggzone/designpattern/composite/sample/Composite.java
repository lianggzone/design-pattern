package com.lianggzone.designpattern.composite.sample;

import java.util.ArrayList;

/**
 * <h3>概要:</h3><p>Composite</p>
 * <h3>功能:</h3><p>容器组件</p>
 * <h3>履历:</h3>
 * <li>2017年6月19日  v0.1 版本内容: 新建</li>
 * @author 粱桂钊
 * @since 0.1
 */
public class Composite implements Component {

    private ArrayList<Component> list = new ArrayList<Component>();

    public void add(Component c) {
        list.add(c);
    }

    public void remove(Component c) {
        list.remove(c);
    }

    public Component getChild(int i) {
        return (Component) list.get(i);
    }

    public void operation(int depth) {
        String pre = "";
        for (int i = 0; i < depth; i++) {
            pre += "-";
        }
        depth = depth + 4;
        System.out.println(pre + "composite");
        for (Object obj : list) {
            ((Component) obj).operation(depth);
        }

    }
}