package com.aspire.shopEase.dao;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.aspire.shopEase.beans.ShopNode;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ShopDao {
	
	private static List<ShopNode> shopNodes;
	
	static{
		shopNodes = generateShopNodes();
	}
	
	private static List<ShopNode> generateShopNodes(){
		List<ShopNode> nodes = new ArrayList<ShopNode>();
		
		// Convert JSON string from file to Object
		ObjectMapper mapper = new ObjectMapper();
		try {
			nodes = mapper.readValue(new File("E:\\Akshay\\workspces\\eclipse_ws\\shopEase-Middleware\\shopEase-MiddleWare\\WebContent\\json\\shops.json"), mapper.getTypeFactory().constructCollectionType(List.class, ShopNode.class));
		} catch (JsonParseException e) {
			System.out.println("JsonParseException " + e.getMessage());
		} catch (JsonMappingException e) {
			System.out.println("JsonMappingException " + e.getMessage());
		} catch (IOException e) {
			System.out.println("IOException " + e.getMessage());
		}		
		return nodes;
	}
	
	public static List<ShopNode> getShopNodes() {
		return shopNodes;
	}

	public static void setShopNodes(List<ShopNode> shopNodes) {
		ShopDao.shopNodes = shopNodes;
	}
}
