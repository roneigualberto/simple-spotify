package com.ronei.simplespotify.config;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.RequestContextFilter;

import com.ronei.simplespotify.api.ArtistaAPI;
import com.ronei.simplespotify.filter.CORSResponseFilter;

@Component
public class JerseyConfig extends ResourceConfig {


	public JerseyConfig() {
		
		register(RequestContextFilter.class);
		register(CORSResponseFilter.class);
		register(ArtistaAPI.class);
	}

}
