package com.lianggzone.designpattern.state.template;

/**
 * 环境(Context)角色
 * @author 粱桂钊
 * @since 
 * <p>更新时间: 2016年3月14日  v0.1</p><p>版本内容: 创建</p>
 */
public class Context {
    
	/*
     * 定义客户端所感兴趣的接口，并且保留一个具体状态类的实例。
     * 这个具体状态类的实例给出此环境对象的现有状态。
     */
    private State state;
    
    public Context(State state){
        this.state = state;
    }
    
    /**
     * 用户感兴趣的接口方法
     */
    public void request(String param) {
        //转调state来处理
        state.handle(param);
    }
}
