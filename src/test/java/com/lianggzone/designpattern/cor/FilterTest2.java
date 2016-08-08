package com.lianggzone.designpattern.cor;

import org.junit.Test;

import com.lianggzone.designpattern.cor.action.filter.action.MsgProcessor;
import com.lianggzone.designpattern.cor.action.filter.action.filter.FilterChain;
import com.lianggzone.designpattern.cor.action.filter.action.filter.HTMLFilter;
import com.lianggzone.designpattern.cor.action.filter.action.filter.SensitivityFilter;
import com.lianggzone.designpattern.cor.action.filter.action.filter.SmileFilter;

public class FilterTest2 {
	
	@Test
    public void test(){
		
		FilterChain filterChain = new FilterChain();
		filterChain.addFilter(new HTMLFilter());
		filterChain.addFilter(new SmileFilter());
		filterChain.addFilter(new SensitivityFilter());
		
		String msg = "你好:)，这句话中有敏感词汇，需要处理。<script>，敏感！";
		
		MsgProcessor mp = new MsgProcessor();
		mp.setMsg(msg);
		mp.setFilterChain(filterChain);
		
		mp.processor();
	}
}