package com.westlife.demo.model;

import java.io.Serializable;

import io.swagger.annotations.ApiModelProperty;

public class School implements Serializable{

	
	private static final long serialVersionUID = 3214407007268660137L;
	@ApiModelProperty("唯一id")
	private String id          ;
	@ApiModelProperty("高校名称")
	private String name        ;
	@ApiModelProperty("高校所在地")
	private String place       ;
	@ApiModelProperty("高校类型")
	private String type        ;
	@ApiModelProperty("高校性质")
	private String properties  ;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getProperties() {
		return properties;
	}
	public void setProperties(String properties) {
		this.properties = properties;
	}
	@Override
	public String toString() {
		return "School [id=" + id + ", name=" + name + ", place=" + place + ", type=" + type + ", properties="
				+ properties + "]";
	}
	
	
	

}
