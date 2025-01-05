package com.camping.employee.repository;

import com.camping.employee.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    List<Employee> findByCampingCenterId(Long campingCenterId);
} 