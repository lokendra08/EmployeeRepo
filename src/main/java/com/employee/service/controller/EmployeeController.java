package com.employee.service.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.employee.service.model.Employee;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	static Map<Integer, Employee> dbMap = new HashMap<>();
	static
	{
		dbMap.put(101,new Employee(101, "Lokendra", "Rawat", "Lowe's", 10000, "Bangalore", "8123510218"));
		dbMap.put(102,new Employee(102, "Biswa", "Sahoo", "Lowe's", 120000, "Bangalore", "8123510219"));
	}
	
	@RequestMapping(value="/{empId}", method= {RequestMethod.GET}, produces={MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<Employee> getEmployeeDetails(@PathVariable("empId") Integer empId) {
		return new ResponseEntity<>(dbMap.get(empId),HttpStatus.OK);
	}
	
	@RequestMapping(value="/create", method= {RequestMethod.POST}, produces={MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<Employee> createEmployee(@RequestBody Employee employee) {
		dbMap.put(employee.getEmployeeId(),employee);
		return new ResponseEntity<>(employee,HttpStatus.CREATED);
	}
	
	@RequestMapping(value="/all", method= {RequestMethod.GET}, produces={MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<List<Employee>> getEmployeeDetails() {
		return new ResponseEntity<>(dbMap.values().stream().map(e->e).collect(Collectors.toList()),HttpStatus.OK);
	}

}
