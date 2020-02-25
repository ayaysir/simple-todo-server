package com.springboot.simpletodo.service;

import java.util.List;

import com.springboot.simpletodo.vo.Todo;

public interface SimpleTodoService {
	
	public List<Todo> selectTodo();
	public int insertTodo(Todo aTodo);
	public int updateTodo(Todo aTodo);
	public int deleteTodo(Todo aTodo);
	
	// commit test

}
