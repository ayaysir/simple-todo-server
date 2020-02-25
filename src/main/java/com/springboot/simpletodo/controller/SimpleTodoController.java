package com.springboot.simpletodo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.simpletodo.service.SimpleTodoService;
import com.springboot.simpletodo.vo.Todo;

@RestController
public class SimpleTodoController {
	
	@Autowired SimpleTodoService stc;
	
	@GetMapping("/get-test")
	public String getTest() {
		return "get test";
	}
	
	@GetMapping("/todo/get")
	public List<Todo> getList() {
		return stc.selectTodo();
	}
	
	@PostMapping("/todo/insert")
	public int insertTodo(Todo aTodo) {
		return stc.insertTodo(aTodo);
	}
	
	@PostMapping("/todo/update")
	public int updateTodo(Todo aTodo) {
		return stc.updateTodo(aTodo);
	}
	
	@PostMapping("/todo/delete")
	public int deleteTodo(Todo aTodo) {
		return stc.deleteTodo(aTodo);
	}
	
}
