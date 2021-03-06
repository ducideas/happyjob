package com.example.controller;

import java.util.Date;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {

	@Value("${application.message:Hello World}")
	private String message = "Hello World";

	/*
	 * @RequestMapping("/") public String welcome(Map<String, Object> model) {
	 * model.put("time", new Date()); model.put("message", this.message); return
	 * "welcome"; }
	 */

	@RequestMapping("/login")
	public String login(Map<String, Object> model) {
		model.put("time", new Date());
		model.put("message", this.message);
		return "login";
	}
	@RequestMapping("services")
	public String service()
	{
		return "services";
	}
	@RequestMapping("portfolio")
	public String portfolio()
	{
		return "portfolio";
	}
	@RequestMapping("blog")
	public String blog()
	{
		return "blog";
	}
	@RequestMapping("contact")
	public String contact()
	{
		return "contact";
	}
}
