package com.majiaxueyuan.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CommonController {
	@RequestMapping("/index")
	public String index(Model model) {
		List<String> list = new ArrayList<String>();
		list.add("1");
		list.add("2");
		list.add("3");
		model.addAttribute("name", "majiaxueyuan");
		model.addAttribute("list", list);
		model.addAttribute("mobile", "13900000000");
		return "index.html";
	}
}