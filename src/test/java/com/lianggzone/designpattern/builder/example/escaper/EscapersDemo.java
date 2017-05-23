package com.lianggzone.designpattern.builder.example.escaper;

import org.junit.Test;

public class EscapersDemo {

    @Test
    public void test(){
        String html = HtmlEscaper.escape("echo foo > file &");
        System.out.println(html);   // [result] echo foo > file &  
    }
}
