package com.aspire.shopEase.resource;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.Path;

import com.aspire.shopEase.dao.RouteDao;
import com.aspire.shopEase.dao.ShopDao;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;

@Path("factory")
public class MainResource {

	private Gson gson = new Gson();
	private RouteDao routeDao = new RouteDao();
	private ShopDao shopDao = new ShopDao(); 
	private ObjectMapper mapper = new ObjectMapper();	
	
	@GET
	@Path("routeNode")
	public String getRouteNodes(){
		
		String result = gson.toJson(routeDao.getRouteNodes());
		Object json;
		try {
			json = mapper.readValue(result, Object.class);
			result = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(json);
		} catch (JsonParseException e) {
			System.out.println("JsonParseException" + e.getMessage());
		} catch (JsonMappingException e) {
			System.out.println("JsonMappingException" + e.getMessage());
		} catch (IOException e) {
			System.out.println("IOException" + e.getMessage());
		}
		return result;
	}
	
	@GET
	@Path("shopNode")
	public String getShopNodes(){
		
		String result = gson.toJson(shopDao.getShopNodes());
		Object json;
		try {
			json = mapper.readValue(result, Object.class);
			result = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(json);
		} catch (JsonParseException e) {
			System.out.println("JsonParseException" + e.getMessage());
		} catch (JsonMappingException e) {
			System.out.println("JsonMappingException" + e.getMessage());
		} catch (IOException e) {
			System.out.println("IOException" + e.getMessage());
		}
		return result;
	}
}
