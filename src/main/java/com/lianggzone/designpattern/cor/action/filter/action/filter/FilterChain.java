package com.lianggzone.designpattern.cor.action.filter.action.filter;

import java.util.ArrayList;
import java.util.List;

import com.lianggzone.designpattern.cor.action.filter.action.model.Request;
import com.lianggzone.designpattern.cor.action.filter.action.model.Response;

public class FilterChain implements Filter {
	
	private List<Filter> filters = new ArrayList<Filter>();
	
	private int index = 0;

	public FilterChain addFilter(Filter filter) {
		this.filters.add(filter);
		return this;
	}

	@Override
	public void doFilter(Request request, Response response,
			FilterChain filterChain) {
		
		if (index >= filters.size()) return;
		
		Filter f = filters.get(index);
		index++;
		f.doFilter(request, response, filterChain);
	}
}