package com.example.hrms.controller;

import static com.example.hrms.constatnts.EmployeeConstants.CREATED_SUCCESSFULLY;

import java.time.LocalDateTime;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.hrms.response.SuccessResponse;
import com.example.hrms.service.EmployeeService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RequestMapping("api/employees")
@RestController
public class EmployeeController {

	private final EmployeeService employeeService;

	@PostMapping
	public ResponseEntity<SuccessResponse> createEmployee(@RequestBody EmployeeDto employeeDto) {

		return ResponseEntity.ok(SuccessResponse.builder().data(employeeService.createEmployee(employeeDto))
				.message(CREATED_SUCCESSFULLY).timestamp(LocalDateTime.now()).build());
	}
}
