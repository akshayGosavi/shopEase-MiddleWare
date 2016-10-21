package com.aspire.shopEase.beans;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName("point")
public class ShopCoordinate {

	@JsonProperty("node")
	private int node;
	
	@JsonProperty("x")
	private int x;
	
	@JsonProperty("y")
	private int y;
	

	@Override
	public String toString() {
		return node + " (" + x + "," + y + ")";
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
	public int getNode() {
		return node;
	}
	public void setNode(int node) {
		this.node = node;
	}
	
	
}
