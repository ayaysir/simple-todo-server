package com.springboot.simpletodo.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.simpletodo.dao.SimpleTodoDAO;
import com.springboot.simpletodo.service.SimpleTodoService;
import com.springboot.simpletodo.vo.Todo;

@Service
public class SimpleTodoServiceImpl implements SimpleTodoService{
	
	@Autowired SimpleTodoDAO std;
	
	@Override
	public List<Todo> selectTodo() {
		return std.selectAll();
	}
	
	@Override
	public int insertTodo(Todo aTodo) {
		return std.insertTodo(aTodo);
	}
	
	@Override
	public int updateTodo(Todo aTodo) {
		return std.updateTodo(aTodo);
	}
	
	@Override
	public int deleteTodo(Todo aTodo) {
		return std.deleteTodo(aTodo);
	}

}
