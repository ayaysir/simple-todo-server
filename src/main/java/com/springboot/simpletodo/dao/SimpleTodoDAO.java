package com.springboot.simpletodo.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class SimpleTodoDAO {
	@Autowired JdbcTemplate jt;
	
	public List<Map<String, Object>> selectAll() {
		
		return jt.query("select * from simple_todo", (rs, rowNum) -> {
			Map<String, Object> aRow = new HashMap<>();
			aRow.put("id", rs.getInt("id"));
			aRow.put("icon", rs.getString("icon"));
			aRow.put("title", rs.getString("title"));
			aRow.put("regDate", rs.getString("reg_date"));
			
			return aRow;
		});
	}
	
	public int insertTodo(String icon, String title) {
		
		return jt.update("insert into simple_todo(id, icon, title, reg_date) "
				+ "values (0, ?, ?, sysdate())", icon, title);
		
	}
	
	public int updateTodo(String id, String icon, String title) {
		
		return jt.update("update simple_todo set icon = ?, title = ? where id = ?",
				icon, title, id);
	}
	
	public int deleteTodo(String id) {
		return jt.update("delete from simple_todo where id = ?", id);
	}

}
