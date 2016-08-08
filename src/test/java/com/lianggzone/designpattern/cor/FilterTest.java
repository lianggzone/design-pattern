package com.lianggzone.designpattern.cor;

import org.junit.Test;

import com.lianggzone.designpattern.cor.action.filter.base.MsgProcessor2;
import com.lianggzone.designpattern.cor.action.filter.base.filter.FilterChain;
import com.lianggzone.designpattern.cor.action.filter.base.filter.HTMLFilter;
import com.lianggzone.designpattern.cor.action.filter.base.filter.SensitivityFilter;
import com.lianggzone.designpattern.cor.action.filter.base.filter.SmileFilter;

public class FilterTest {
	
	@Test
    public void test(){
		
		FilterChain filterChain = new FilterChain();
		filterChain.addFilter(new HTMLFilter());
		filterChain.addFilter(new SmileFilter());
		filterChain.addFilter(new SensitivityFilter());
		
		String msg = "你好:)，这句话中有敏感词汇，需要处理。<script>，敏感！";
		
		MsgProcessor2 mp = new MsgProcessor2();
		mp.setMsg(msg);
		mp.setFilterChain(filterChain);
		
		msg = mp.processor();
		System.out.println(msg);
	}
}