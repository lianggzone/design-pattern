package com.lianggzone.designpattern.template_method.example.print;

public class Client {

	public static void main(String[] args) {
		AbstractPrint stringPrint = new StringPrint();
	    stringPrint.write("梁桂钊");
		
		AbstractPrint charPrint = new CharPrint();
		charPrint.write("梁桂钊");
	}
}
