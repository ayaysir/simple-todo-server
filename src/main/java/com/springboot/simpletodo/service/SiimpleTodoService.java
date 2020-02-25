package com.springboot.simpletodo.service;

import java.util.List;
import java.util.Map;

public interface SiimpleTodoService {
	
	public List<Map<String, Object>> selectTodo();
	public int insertTodo();
	public int updateTodo();
	public int deleteTodo();
	
	// commit test

}
