package com.kodilla.hibernate.manytomany.dao;

import com.kodilla.hibernate.manytomany.Employee;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class EmployeeDaoTestSuite {
    @Autowired
    private EmployeeDao employeeDao;

    @Test
    public void testFindByLastName() {
        //Given
        Employee johnSmith = new Employee("John", "Smith");
        employeeDao.save(johnSmith);

        //When
        List<Employee> employees = employeeDao.findByLastName("Smith");

        //Then
        assertEquals(1, employees.size());

        //Cleanup
        employeeDao.deleteById(johnSmith.getId());
    }
}
