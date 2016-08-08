package com.lianggzone.designpattern.cor.action.filter.action.filter;

import com.lianggzone.designpattern.cor.action.filter.action.model.Request;
import com.lianggzone.designpattern.cor.action.filter.action.model.Response;

/**
 * Filter
 * @author 粱桂钊
 * @since 
 * <p>更新时间: 2016年8月9日  v0.1</p><p>版本内容: 创建</p>
 */
public interface Filter {

	void doFilter(Request request, Response response, FilterChain filterChain);
}
