package com.aspire.shopEase.resource;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.aspire.shopEase.beans.Point;
import com.aspire.shopEase.beans.Shop;
import com.aspire.shopEase.beans.ShoppingComplex;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Path("test")
public class AllResourceTest {

	@GET
	@Path("point")
	@Produces(MediaType.APPLICATION_JSON)
	public String testPoint(){
		Point pt = new Point();
		pt.setX_pos(10);
		pt.setY_pos(10);
		pt.setName("TestPoint");

		ObjectMapper mapper = new ObjectMapper();
		String jsonInString = "initial value";
		// Convert object to JSON string and pretty print
		try {
			jsonInString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(pt);
		} catch (JsonProcessingException e) {
			System.out.println("json exception " + e.getMessage());
			//TODO logging exceptions 
		} 
		return jsonInString;
	}
	
	@GET
	@Path("shop")
	@Produces(MediaType.APPLICATION_JSON)
	public String testShop(){
		Point pt = new Point();
		pt.setX_pos(10);
		pt.setY_pos(10);
		pt.setName("TestPoint");
		
		List<Point> ptArr = new ArrayList<Point>();
		ptArr.add(pt);
		
		Shop shop = new Shop();
		shop.setName("TestShop");
		shop.setFloor(1);
		shop.setCoordinates(ptArr);

		ObjectMapper mapper = new ObjectMapper();
		String jsonInString = "initial value";
		// Convert object to JSON string and pretty print
		try {
			jsonInString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(shop);
		} catch (JsonProcessingException e) {
			System.out.println("json exception " + e.getMessage());
			//TODO logging exceptions 
		} 
		return jsonInString;
	}
	
	@GET
	@Path("shoppingComplex")
	@Produces(MediaType.APPLICATION_JSON)
	public String testShoppingComplex(){
		ShoppingComplex sx = new ShoppingComplex();
		sx.setName("TestShoppingComplex");
		sx.setLocation("TestLocation");
		
		ObjectMapper mapper = new ObjectMapper();
		String jsonInString = "initial value";
		// Convert object to JSON string and pretty print
		try {
			jsonInString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(sx);
		} catch (JsonProcessingException e) {
			System.out.println("json exception " + e.getMessage());
			//TODO logging exceptions 
		} 
		return jsonInString;
	}
}
