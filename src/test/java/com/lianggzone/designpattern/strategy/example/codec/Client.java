package com.lianggzone.designpattern.strategy.example.codec;

public class Client {

    public static void main(String[] args) {
	    Context context = new Context(new MD5Strategy());
        context.encrypt();
        
        Context context2 = new Context(new DESStrategy());
        context2.encrypt();
    }
}
