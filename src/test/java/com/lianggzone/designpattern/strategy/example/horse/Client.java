package com.lianggzone.designpattern.strategy.example.horse;

import com.lianggzone.designpattern.strategy.example.horse.Context;


public class Client {

    public static void main(String[] args) {
	    Context context = new Context(new FirstClassHorse());
        context.run();

        Context context2 = new Context(new MediumHorse());
        context2.run();
        
        Context context3 = new Context(new InferiorHorseHorse());
        context3.run();
    }
}
