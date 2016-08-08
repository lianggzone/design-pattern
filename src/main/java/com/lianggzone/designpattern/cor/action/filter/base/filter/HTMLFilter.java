package com.lianggzone.designpattern.cor.action.filter.base.filter;

/**
 * HTML过滤器
 * @author 粱桂钊
 * @since 
 * <p>更新时间: 2016年8月9日  v0.1</p><p>版本内容: 创建</p>
 */
public class HTMLFilter extends Filter{

	@Override
	public String doFilter(String msg) {
		msg = msg.replace("<", "{").replace(">", "}");
		return msg;
	}
}