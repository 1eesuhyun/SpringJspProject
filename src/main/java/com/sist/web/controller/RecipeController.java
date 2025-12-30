package com.sist.web.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.sist.web.service.RecipeService;

import lombok.RequiredArgsConstructor;

import java.util.*;
@Controller
public class RecipeController {
	
	@GetMapping("/list")
	public String recipe_list()
	{
		return "recipe/list";
	}
	@GetMapping("/detail")
	public String recipe_detail(@RequestParam("no")int no)
	{
		
		return "recipe/detail";
	}
}
