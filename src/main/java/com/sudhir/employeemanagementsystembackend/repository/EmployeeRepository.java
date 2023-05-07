package com.sudhir.employeemanagementsystembackend.repository;

import com.sudhir.employeemanagementsystembackend.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> {
}
