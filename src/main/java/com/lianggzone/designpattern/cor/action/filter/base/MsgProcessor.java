package com.lianggzone.designpattern.cor.action.filter.base;

@Deprecated
public class MsgProcessor {
	
	private String msg;

	// 第一版：没有使用责任链模式
	/*
	public String processor() {
		String content = "";
		if (null != msg && !"".equals(msg.trim())) {	
			content = msg.replace("<", "{").replace(">", "}");
			content = content.replace("敏感", "");
			content = content.replace(":)", "^V^");
		}
		return content;
	}*/
	// 第二版：
	/*
	public String processor(){
	    if(null != msg && !("").equals(msg.trim())){
	        msg = new HTMLFilter().doFilter(msg);
	        msg = new SmileFilter().doFilter(msg);
	        msg = new SensitivityFilter().doFilter(msg);
	    }
	    return msg;
	}*/
	// 第三版：
	/*
	Filter[] filters = {new HTMLFilter(), new SmileFilter(), new SensitivityFilter()};	
	public String processor(){
	    if(null != msg && !("").equals(msg.trim())){
	        for(Filter f : filters){
	            msg = f.doFilter(msg);
	        }
	    }
	    return msg;
	}*/
	
	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
}