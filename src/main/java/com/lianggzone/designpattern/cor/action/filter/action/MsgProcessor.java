package com.lianggzone.designpattern.cor.action.filter.action;

import com.lianggzone.designpattern.cor.action.filter.action.filter.FilterChain;
import com.lianggzone.designpattern.cor.action.filter.action.model.Request;
import com.lianggzone.designpattern.cor.action.filter.action.model.Response;

public class MsgProcessor {
	
	private String msg;

	private FilterChain filterChain;

	public void processor() {
		Request request = new Request();
		request.setRequestStr(msg);
		
		Response response = new Response();
		response.setResponseStr(msg);
		
		filterChain.doFilter(request, response, filterChain);
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