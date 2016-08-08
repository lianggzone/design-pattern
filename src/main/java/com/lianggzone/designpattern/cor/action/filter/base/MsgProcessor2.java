package com.lianggzone.designpattern.cor.action.filter.base;

import com.lianggzone.designpattern.cor.action.filter.base.filter.FilterChain;

public class MsgProcessor2 {
	
	private String msg;

	private FilterChain filterChain;

	public String processor() {
		return filterChain.doFilter(msg);
	}
	
	public FilterChain getFilterChain() {
		return filterChain;
	}

	public void setFilterChain(FilterChain filterChain) {
		this.filterChain = filterChain;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
}