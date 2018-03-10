/**
 * 
 */
package com.westlife.demo.common;

import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotEmpty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 
 * @author  westlife
 * @date 创建时间：2017年12月15日 下午4:33:38 
 * @version 1.0 
 * @parameter
 *
 */
@ApiModel(value = "请求参数", description = "请求参数")
public class RequestDto {
	
	@NotEmpty(message="身份证号码不能为空!!!,请输入身份证号码")
	@Pattern(regexp="^[1-9]\\d{5}[1-9]\\d{3}((0\\d)|(1[0-2]))(([0|1|2]\\d)|3[0-1])\\d{3}[0-9X]$",message="身份证格式错误!!!,必须为18位")
	private String IDCard;
	
	@ApiModelProperty("省份证号码")
	public String getIDCard() {
		return IDCard;
	}

	public void setIDCard(String iDCard) {
		IDCard = iDCard;
	}


}
