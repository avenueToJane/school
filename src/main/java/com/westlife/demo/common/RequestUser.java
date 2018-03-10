
package com.westlife.demo.common;

import java.io.Serializable;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

import io.swagger.annotations.ApiModelProperty;

/**
 * @NotEmpty 用在集合类上面
    @NotBlank 用在String上面
    @NotNull    用在基本类型上
 * @author  westlife
 * @date 创建时间：2017年12月15日 下午4:33:50 
 * @version 1.0 
 * @parameter
 *
 */
public class RequestUser implements Serializable{
	
	private static final long serialVersionUID = 1492973623389075081L;
	
	@NotNull(message="id不能为空!!!")
	//@Pattern(regexp="0",message="id固定为0!!!")
    private Integer id;
	
	@NotEmpty(message="username不能为空!!!")
	@Pattern(regexp="^[0-9]{4,8}$",message="用户名为4-8位")
    private String username;
	
	@NotEmpty(message="password不能为空!!!")
	@Pattern(regexp="^[0-9]{4,8}$",message="密码为4-8位")
    private String password;
	
	@NotEmpty(message="email不能为空!!!")
	@Email(message="邮箱格式不正确")
    private String email;
	
	@NotNull(message="useable不能为空!!!")
	//@Pattern(regexp="1",message="状态固定为1!!!")
    private Integer useable;
    /**
     * @return username
     */
    @ApiModelProperty("用户名称")
    public String getUsername() {
        return username;
    }

    /**
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return password
     */
    @ApiModelProperty("登陆密码")
    public String getPassword() {
        return password;
    }

    /**
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return email
     */
    @ApiModelProperty("邮箱")
    public String getEmail() {
        return email;
    }

    /**
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * 获取是否可用(0禁用,1可用)
     *
     * @return useable - 是否可用(0禁用,1可用)
     */
    @ApiModelProperty("状态是否可用(0禁用,1可用)")
    public Integer getUseable() {
        return useable;
    }

    /**
     * 设置是否可用(0禁用,1可用)
     *
     * @param useable 是否可用(0禁用,1可用)
     */
    public void setUseable(Integer useable) {
        this.useable = useable;
    }
    @ApiModelProperty("唯一标识id")
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

    

   

}
