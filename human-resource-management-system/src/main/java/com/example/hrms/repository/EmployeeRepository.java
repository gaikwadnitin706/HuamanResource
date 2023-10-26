package com.example.hrms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.hrms.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, String> {

}
