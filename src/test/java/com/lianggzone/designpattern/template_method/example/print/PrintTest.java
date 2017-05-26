package com.lianggzone.designpattern.template_method.example.print;

import org.junit.Test;

public class PrintTest {

	@Test
	public void test(){
	    AbstractPrint stringPrint = new StringPrint();
	    stringPrint.write("梁桂钊");
		
		AbstractPrint charPrint = new CharPrint();
		charPrint.write("梁桂钊");
	}
}
