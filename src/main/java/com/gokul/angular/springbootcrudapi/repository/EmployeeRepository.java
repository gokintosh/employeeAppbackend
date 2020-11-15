package com.gokul.angular.springbootcrudapi.repository;

import com.gokul.angular.springbootcrudapi.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {

}
