package com.EMS.Employee.Management.System.service.ServiceIMPL;

import org.springframework.stereotype.Service;

import com.EMS.Employee.Management.System.Model.Employee;
import com.EMS.Employee.Management.System.Repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository employeeRepository;
    @Override
    public Employee createRegistration(Employee registration) {
        Employee local= this.EmployeeService.findByUsername(registration.getUsername());
        if(local!=null){
         System.out.println("User is already there!!");
         throw new Exception("User already present!!");
        }
        return local;
    }
    

    @Override
    public Employee getreRegistration(String username) {
       return employeeRepository.findAll();
    }

    @Override
    public void deleteRegistration(Integer id) {
       return employeeRepository.deleteById(id);
    }
    
}
