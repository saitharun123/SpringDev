package com.fmc.SpringJDBC.repo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.fmc.SpringJDBC.model.Student;

@Repository
public class StudentRepo {
	
	@Autowired
	private JdbcTemplate jdbc;

	public JdbcTemplate getJdbc() {
		return jdbc;
	}
	
	public void save(Student s) {
		
		String query = "insert into student(sid,name,marks) values(?,?,?)";
		int rows = jdbc.update(query,s.getSid(),s.getName(),s.getMarks());
		
		System.out.println(rows+ " rows effected");
	}

	public List<Student> findAll() {
		String query = "select * from student";
		
		RowMapper<Student> mapper = new RowMapper<>(){
			@Override
			public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
				Student s = new Student();
				s.setSid(rs.getInt("sid"));
				s.setName(rs.getString("name"));
				s.setMarks(rs.getInt("marks"));
				return s;
			}
		};
			
		List<Student> students = jdbc.query(query, mapper);
		
		return students;
	}

}
