package com.aspire.shopEase.dao;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.aspire.shopEase.beans.RouteNode;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class RouteDao {

	private static List<RouteNode> routeNodes; 

	
	static{
		routeNodes = generateRouteNodes();
	}

	private static List<RouteNode> generateRouteNodes(){
		List<RouteNode> nodes = new ArrayList<RouteNode>();
		
		// Convert JSON string from file to Object
		ObjectMapper mapper = new ObjectMapper();
		try {
			nodes = mapper.readValue(new File("E:\\Akshay\\workspces\\eclipse_ws\\shopEase-Middleware\\shopEase-MiddleWare\\WebContent\\json\\nodes.json"), mapper.getTypeFactory().constructCollectionType(List.class, RouteNode.class));
		} catch (JsonParseException e) {
			System.out.println("JsonParseException " + e.getMessage());
		} catch (JsonMappingException e) {
			System.out.println("JsonMappingException " + e.getMessage());
		} catch (IOException e) {
			System.out.println("IOException " + e.getMessage());
		}		
		return nodes;
	}

	public static List<RouteNode> getRouteNodes() {
		return routeNodes;
	}

	public static void setRouteNodes(List<RouteNode> routeNodes) {
		RouteDao.routeNodes = routeNodes;
	}
}
