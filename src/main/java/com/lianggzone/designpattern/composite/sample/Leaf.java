package com.lianggzone.designpattern.composite.sample;

/**
 * <h3>概要:</h3><p>Leaf</p>
 * <h3>功能:</h3><p>叶子组件</p>
 * <h3>履历:</h3>
 * <li>2017年6月19日  v0.1 版本内容: 新建</li>
 * @author 粱桂钊
 * @since 0.1
 */
class Leaf implements Component {
    public void add(Component c) {
    }

    public void remove(Component c) {
    }

    public Component getChild(int i) {
        return null;
    }

    public void operation(int depth) {
        String pre = "";
        for (int i = 0; i < depth; i++) {
            pre += "-";
        }
        System.out.println(pre + "leaf");
    }
}