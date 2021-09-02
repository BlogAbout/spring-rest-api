package ru.blogabout.springrestapi.repository;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.blogabout.springrestapi.model.Employee;

import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    List<Employee> findByName(String name);

    List<Employee> findByNameAndLocation(String name, String location);

    List<Employee> findByNameContaining(String keyword, Sort sort);
}