package com.lianggzone.designpattern.decorator.example.print;

public class Client {
    public static void main(String[] args) {
        String name = "梁桂钊";

        AbstractStyle style = new StringStyle();
        style.print(name);

        System.out.println();

        AbstractStyle style2 = new ConcreteDecoratorStyle1(style);
        style2.print(name);

        System.out.println();

        AbstractStyle style3 = new ConcreteDecoratorStyle2(style2);
        style3.print(name);
    }
}
