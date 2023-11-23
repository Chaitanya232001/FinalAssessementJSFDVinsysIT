package com.EMS.Employee.Management.System.service.ServiceIMPL;

import com.EMS.Employee.Management.System.Model.Employee;

public interface EmployeeService {
     //creating user
     Employee createRegistration(Employee registration);
    
     //get registration by username
     public Employee getreRegistration(String username);
 
     //delete registration by id
      public void deleteRegistration(Integer id);
}
