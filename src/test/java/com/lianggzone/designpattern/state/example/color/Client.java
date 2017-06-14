package com.lianggzone.designpattern.state.example.color;

public class Client {
    public static void main(String[] args) {
        Context context = new Context();
        context.setState(new GreenState());
        System.out.println(context.getCurState());

        context.next();
        System.out.println(context.getCurState());

        context.next();
        System.out.println(context.getCurState());

        context.next();
        System.out.println(context.getCurState());
    }
}
