package com.lianggzone.designpattern.chain.example.filter;

public class Client {
    public static void main(String[] args) {
        FilterChain filterChain = new FilterChain();
        filterChain.addFilter(new HTMLFilter());
        filterChain.addFilter(new SensitivityFilter());

        String msg = "<script>alert(\"你好,梁桂钊！我想说一个敏感词汇。\")</script>";

        MsgProcessor msgProcessor = new MsgProcessor(msg, filterChain);

        msg = msgProcessor.processor();
        System.out.println(msg);
    }
}
