package com.springboot.simpletodo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.springboot.simpletodo.vo.Todo;

@Repository
public class SimpleTodoDAO {
	@Autowired JdbcTemplate jt;
	
	public List<Todo> selectAll() {
		
		return jt.query("select * from simple_todo", (rs, rowNum) -> {
			Todo aTodo = new Todo();
			aTodo.setId(rs.getInt("id"));
			aTodo.setIcon(rs.getString("icon"));
			aTodo.setTitle(rs.getString("title"));
			aTodo.setDetail(rs.getString("detail"));
			aTodo.setRegDate(rs.getString("reg_date"));
			aTodo.setModDate(rs.getString("mod_date"));
			
			return aTodo;
		});
	}
	
	public int insertTodo(Todo aTodo) {
		
		return jt.update("insert into simple_todo(id, icon, title, detail, reg_date, mod_date) "
				+ "values (0, ?, ?, ?, sysdate(), sysdate())", aTodo.getIcon(), aTodo.getTitle(), aTodo.getDetail());
		
	}
	
	public int updateTodo(Todo aTodo) {
		
		return jt.update("update simple_todo set icon = ?, title = ?, detail = ?, mod_date = sysdate() where id = ?",
				aTodo.getIcon(), aTodo.getTitle(), aTodo.getDetail(), aTodo.getId());
	}
	
	public int deleteTodo(Todo aTodo) {
		return jt.update("delete from simple_todo where id = ?", aTodo.getId());
	}

}
