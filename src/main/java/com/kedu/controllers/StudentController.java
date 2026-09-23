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
		return "/students";
	}
	
	@RequestMapping("/insert")
	public String insert(StudentDTO dto) {
		dao.insert(dto);
		return "/students";
	}
	
	@RequestMapping("/list")
	public String list(Model model) {
		List<StudentDTO> list = dao.studentsList();
		model.addAttribute("list", list);
		return "/list";
	}
	
	@RequestMapping("/update")
	public String update(StudentDTO dto) {
		dao.updateList(dto);
		return "redirect:/student/list";
	}
	
	@RequestMapping("/delete")
	public String delete(int id) {
		dao.deleteList(id);
		return "redirect:/student/list";
	}
	
	@RequestMapping("/search")
	public String search(String name, Model model) {
		List<StudentDTO> list = dao.searchList(name);
		model.addAttribute("searchlist", list);
		return "redirect:/student/list";
	}
}
