package com.EMS.Employee.Management.System.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.EMS.Employee.Management.System.Model.Employee;
import com.EMS.Employee.Management.System.Repository.EmployeeRepository;

@Controller
// @RequestMapping("/api/employees")
public class EmployeeController {

    @Autowired
    private EmployeeRepository employeeRepository;

    @GetMapping("/index")
    public String indexpg() {
        return "index";
    }
  
    @GetMapping

    public List<Employee> getAllEmployees()

    {
        return employeeRepository.findAll();
    }

    @PostMapping
    public String createEmployee(@ModelAttribute Employee employee) {
        employeeRepository.save(employee);
        return "redirect:/api/employees";
    }

}
