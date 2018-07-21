package com.evento.rest;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value ="/local")
public class LocalREST {
	
	
	@RequestMapping(value = "/indexLocal")
	public String getIndexPage() {
		return "index";
	}
}
