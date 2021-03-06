package com.aspire.shopEase.beans;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName("route")
public class RouteNode {

	@JsonProperty("name")
	private String name;
	
	@JsonProperty("x")
	private int x;
	
	@JsonProperty("y")
	private int y;
	
	@JsonProperty("next")
	private int[] nextPt;
	
	@Override
	public String toString() {
		return "<" + this.name + " (" + x + "," + y + ")>";
	}
	
	public int getX_pos() {
		return x;
	}
	public void setX_pos(int x) {
		this.x = x;
	}
	public int getY_pos() {
		return y;
	}
	public void setY_pos(int y) {
		this.y = y;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int[] getNextPt() {
		return nextPt;
	}
	public void setNextPt(int[] nextPt) {
		this.nextPt = nextPt;
	}
	
	
}
