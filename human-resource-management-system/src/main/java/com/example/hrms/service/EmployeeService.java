package com.example.hrms.service;

import org.springframework.stereotype.Service;

import com.example.hrms.controller.EmployeeDto;
import com.example.hrms.repository.EmployeeRepository;
import com.example.hrms.utils.EmployeeUtils;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class EmployeeService {

	private final EmployeeRepository employeeRepository;
	private final EmployeeUtils employeeUtils;

	public String createEmployee(EmployeeDto employeeDto) {

		return employeeRepository.save(employeeUtils.dtoToEntity(employeeDto)).getEmployeeId();
	}

}
