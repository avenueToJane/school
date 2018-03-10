package com.westlife.demo.common;

import java.util.List;


import io.swagger.annotations.ApiModelProperty;
/**
 * 
 * @author  westlife
 * @date 创建时间：2017年12月15日 下午4:32:59 
 * @version 1.0 
 * @parameter
 * 封装返回数据2
 */
public class AjaxResult {

	private int retcode = 0;//成功返回码
	private String retmsg = "操作成功";
	@ApiModelProperty("发送返回码")
	public int getRetcode() {
		return retcode;
	}


	public void setRetcode(int retcode) {
		this.retcode = retcode;
	}

	@ApiModelProperty("信息描述")
	public String getRetmsg() {
		return retmsg;
	}


	public void setRetmsg(String retmsg) {
		this.retmsg = retmsg;
	}


	@Override
	public String toString() {
		return "AjaxResult [retcode=" + retcode + ", retmsg=" + retmsg + "]";
	}
}
