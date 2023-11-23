package com.EMS.Employee.Management.System.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.EMS.Employee.Management.System.Model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    public Employee findByUsername(String username);
    public Employee findByEmail(String email);
}
