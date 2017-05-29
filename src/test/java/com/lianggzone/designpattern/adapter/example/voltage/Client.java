package com.lianggzone.designpattern.adapter.example.voltage;

public class Client {
    
	public static void main(String[] args) {
		 Adapter adapter = new Adapter();
	     adapter.getVoltage(); 
	     
	     Adapter2 adapter2 = new Adapter2();
	     adapter2.getVoltage(); 
	}
}
