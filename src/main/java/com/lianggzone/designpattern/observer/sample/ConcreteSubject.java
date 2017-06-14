package com.lianggzone.designpattern.observer.sample;

/**
 * <h3>概要:</h3><p>ConcreteSubject</p>
 * <h3>功能:</h3><p>具体的目标类</p>
 * <h3>履历:</h3>
 * <li>2017年6月14日  v0.1 版本内容: 新建</li>
 * @author 粱桂钊
 * @since 0.1
 */
class ConcreteSubject extends Subject {
    /**
     * 通知方法
     */
    public void notifyObserver() {
        for (Object observer : observers) {
            ((Observer) observer).update();
        }
    }
}