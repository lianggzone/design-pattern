package com.lianggzone.designpattern.cor.action.filter.base.filter;

import java.util.ArrayList;
import java.util.List;

public class FilterChain {
	
	List<Filter> filters = new ArrayList<Filter>();

	public FilterChain addFilter(Filter filter) {
		filters.add(filter);
		return this;
	}

	public String doFilter(String str) {
		if (null != str && !("").equals(str.trim())) {
			for (Filter f : filters) {
				str = f.doFilter(str);
			}
		}
		return str;
	}
}