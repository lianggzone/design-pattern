package com.lianggzone.designpattern.cor.action.filter.base.filter;

/**
 * Filter
 * @author 粱桂钊
 * @since 
 * <p>更新时间: 2016年8月9日  v0.1</p><p>版本内容: 创建</p>
 */
public abstract class Filter {

	protected Filter filter;
	
	public void addLast(Filter filter) {
        this.filter = filter;
    }
	
	public abstract String doFilter(String msg);
}
