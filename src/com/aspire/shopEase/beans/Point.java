package com.aspire.shopEase.beans;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName("point")
public class Point {

	@JsonProperty("name")
	private String name;
	@JsonProperty("x")
	private int x_pos;
	@JsonProperty("y")
	private int y_pos;
	
	public int getX_pos() {
		return x_pos;
	}
	public void setX_pos(int x_pos) {
		this.x_pos = x_pos;
	}
	public int getY_pos() {
		return y_pos;
	}
	public void setY_pos(int y_pos) {
		this.y_pos = y_pos;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return this.name + " (" + x_pos + "," + y_pos + ")";
	}
	
	
}
