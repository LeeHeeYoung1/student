package com.kedu.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.kedu.dao.StudentDAO;
import com.kedu.dto.StudentDTO;

@Controller
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	StudentDAO dao;
	
	@RequestMapping("/add")
	public String register() {
		return "/";
	}
	
	
	
	
	
	@RequestMapping("/list")
	public String list(Model model) {
		List<StudentDTO> list = dao.studentsList();
		model.addAttribute("list", list);
		return "/";
	}
	
	@RequestMapping("/")
	public String update(StudentDTO dto) {
		dao.updateList(dto);
		return "/";
	}
	
	@RequestMapping("/")
	public String delete(int id) {
		dao.deleteList(id);
		return "/";
	}
	
	@RequestMapping("/")
	public String search(String name, Model model) {
		List<StudentDTO> list = dao.searchList(name);
		model.addAttribute("list", list);
		return "/";
	}
}
