package com.spring.boot.security.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.spring.boot.security.app.pojo.Employee;

@RepositoryRestResource
public interface EMSDao extends JpaRepository<Employee, Integer> {

}
