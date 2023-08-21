package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.employee;
import com.example.demo.service.employeeService;

@RestController
public class EmployeeController {
@Autowired
employeeService eser;
@PostMapping("add")
public employee add(@RequestBody employee ee)
{
	return eser.saveinfo(ee);
}
@GetMapping("disp")
public List<employee> show()
{
	return eser.showinfo();
}
}
