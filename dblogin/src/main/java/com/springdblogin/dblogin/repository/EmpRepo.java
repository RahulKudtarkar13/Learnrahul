package com.springdblogin.dblogin.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springdblogin.dblogin.entity.Employee;

public interface EmpRepo extends JpaRepository<Employee,Integer> {

    public Employee findByEmail(String email);

    
}
