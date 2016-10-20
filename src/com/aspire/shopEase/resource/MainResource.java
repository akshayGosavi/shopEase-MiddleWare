package com.aspire.shopEase.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import com.aspire.shopEase.dao.ShopEaseDao;
import com.google.gson.Gson;

@Path("factory")
public class MainResource {

	private Gson gson = new Gson();
	private ShopEaseDao dao = new ShopEaseDao();
	
	@GET
	@Path("routeNode")
	public String getRouteNodes(){
		return gson.toJson(dao.getAllRouteNodes());
	}
}
