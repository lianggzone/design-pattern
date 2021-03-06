package com.lianggzone.designpattern.template_method.example.print;

/**
 * <h3>概要:</h3><p>AbstractPrint</p>
 * <h3>功能:</h3><p>字符实现类</p>
 * <h3>履历:</h3>
 * <li>2016年8月26日  v0.1 版本内容: 新建</li>
 * @author 粱桂钊
 * @since 0.1
 */
public class CharPrint extends AbstractPrint{

    @Override
    protected void open() {
        System.out.print("<");
    }

    @Override
    protected void print(String text) {
        System.out.print(text);
    }

    @Override
    protected void close() {
        System.out.println(">");
    }
}