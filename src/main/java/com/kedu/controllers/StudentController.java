package com.kedu.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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
	public String list() {
		List<StudentDTO> list = dao.;
		return "/";
	}
	
	@RequestMapping("/")
	public String update() {
		dao.;
		return "/";
	}
	
	@RequestMapping("/")
	public String delete() {
		dao.;
		return "/";
	}
	
	@RequestMapping("/")
	public String search() {
		List<StudentDTO> list = dao.;
		return "/";
	}
}
