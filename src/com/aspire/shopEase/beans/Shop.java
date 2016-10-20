package com.aspire.shopEase.beans;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName("shop")
public class Shop {
	
	@JsonProperty("name")
	private String name;
	@JsonProperty("floor")
	private int floor;
	@JsonProperty("coordinates")
	private List<Point> coordinates;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getFloor() {
		return floor;
	}
	public void setFloor(int floor) {
		this.floor = floor;
	}
	public List<Point> getCoordinates() {
		return coordinates;
	}
	public void setCoordinates(List<Point> coordinates) {
		this.coordinates = coordinates;
	}
	@Override
	public String toString() {
		return this.name;
	}
	
	
}
