package com.aspire.shopEase.dao;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServlet;

import com.aspire.shopEase.beans.RouteNode;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ShopEaseDao {

	private static List<RouteNode> routeNodes; 
	
	static{
		routeNodes = generateRouteNodes();
	}

	private static List<RouteNode> generateRouteNodes(){
		List<RouteNode> nodes = new ArrayList<RouteNode>();
		
		// Convert JSON string from file to Object
		ObjectMapper mapper = new ObjectMapper();
		try {
			nodes = mapper.readValue(new File(""), mapper.getTypeFactory().constructCollectionType(List.class, RouteNode.class));
		} catch (JsonParseException e) {
			System.out.println("JsonParseException " + e.getMessage());
		} catch (JsonMappingException e) {
			System.out.println("JsonMappingException " + e.getMessage());
		} catch (IOException e) {
			System.out.println("IOException " + e.getMessage());
		}
		System.out.println(nodes);
		
		return nodes;
	}
	
	public List<RouteNode> getAllRouteNodes(){
		return this.routeNodes;
	}
}
