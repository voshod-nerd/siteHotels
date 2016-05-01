package com.infiniteskills.mvc.repository;



import java.util.List;

import com.infiniteskills.mvc.entity.Department;

 
public interface DepartmentRepository {
 
    List<Department> findAll();

    List<Department> findAllWithDetails();

    Department save(Department post);

    void delete(Department post);
}
