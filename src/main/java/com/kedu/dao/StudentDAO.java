package com.kedu.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.kedu.dto.StudentDTO;

@Repository
public class StudentDAO {

	@Autowired
	private JdbcTemplate jdbc;
	
	public int insert(StudentDTO dto) {
		String sql = "insert into student values(student_seq.nextval, ?, ?, ?, ?)";
		return jdbc.update(sql, dto.getName(), dto.getKor(), dto.getEng(), dto.getMath());
	}
	
	public List<StudentDTO> studentsList() {
		String sql = "select * from student";
		return jdbc.query(sql, new BeanPropertyRowMapper<>(StudentDTO.class));
		
	}
	
	public int deleteList(int id) {
		String sql = "delete from student where id = ?";
		return jdbc.update(sql, id);
	}
	
	public int updateList(StudentDTO dto) {
		String sql = "update student set name=?, kor=?, eng=?, math=? where id=?";

		return jdbc.update(sql,
				dto.getName(),
				dto.getKor(),
				dto.getEng(),
				dto.getMath(),
				dto.getId());
	}
	
	public List<StudentDTO> searchList(String name) {
		String sql = "select * from student where name like ?";

		return jdbc.query(sql,
				new BeanPropertyRowMapper<>(StudentDTO.class),
				"%" + name + "%");
	}
	
}
