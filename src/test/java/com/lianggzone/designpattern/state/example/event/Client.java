package com.lianggzone.designpattern.state.example.event;


public class Client {
    public static void main(String[] args) {
        Context context = new Context();
        context.setState(new UnconnectState());
        context.next();
        context.next();
        context.next();
        context.next();
    }
}
