package com.springboot.simpletodo.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.simpletodo.dao.SimpleTodoDAO;

@RestController
public class SimpleTodoController {
	
	@Autowired SimpleTodoDAO std;
	
	@GetMapping("/get-test")
	public String getTest() {
		return "get test";
	}
	
	@GetMapping("/todo/get")
	public List<Map<String, Object>> getList() {
		return std.selectAll();
	}
	
	@PostMapping("/todo/insert")
	public boolean insertTodo(String icon, String title) {
		return std.insertTodo(icon, title) == 0 ? false : true;
	}
	
	@PostMapping("/todo/update")
	public int updateTodo(String id, String icon, String title) {
		return std.updateTodo(id, icon, title);
	}
	
	@PostMapping("/todo/delete")
	public int deleteTodo(String id) {
		return std.deleteTodo(id);
	}
}
