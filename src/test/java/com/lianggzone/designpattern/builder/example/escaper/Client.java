package com.lianggzone.designpattern.builder.example.escaper;

public class Client {

	public static void main(String[] args) {
		String html = HtmlEscaper.escape("echo foo > file &");
        System.out.println(html);   // [result] echo foo > file &  
	}
}
