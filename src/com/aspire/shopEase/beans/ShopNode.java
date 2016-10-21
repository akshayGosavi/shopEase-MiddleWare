package com.aspire.shopEase.beans;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonRootName("shop")
public class ShopNode {
	
	@JsonProperty("name")
	private String name;
	
	@JsonProperty("floor")
	private int floor;
	
	@JsonProperty("coordinates")
	private List<ShopCoordinate> coordinates;
	
	@JsonProperty("multicoords")
	private Boolean multicoords;
	
	@Override
	public String toString() {
		return this.name;
	}
	
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
	public List<ShopCoordinate> getCoordinates() {
		return coordinates;
	}
	public void setCoordinates(List<ShopCoordinate> coordinates) {
		this.coordinates = coordinates;
	}
	public Boolean getMulticoords() {
		return multicoords;
	}
	public void setMulticoords(Boolean multicoords) {
		this.multicoords = multicoords;
	}
}
