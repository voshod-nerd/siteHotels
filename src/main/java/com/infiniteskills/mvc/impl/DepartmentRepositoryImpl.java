package com.infiniteskills.mvc.impl;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;
import javax.persistence.EntityManager;
import com.infiniteskills.mvc.entity.Department;

import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import com.infiniteskills.mvc.repository.DepartmentRepository;

@Service("jpaDepartmentService")
@Transactional
@Repository
public class DepartmentRepositoryImpl implements DepartmentRepository {

    @PersistenceContext
    private EntityManager em;

    public List<Department> findAll() {
        return em.createNamedQuery("Department.findAll").getResultList();
    }

    public List<Department> findAllWithDetails() {
        return em.createNamedQuery("Department.findAllWithDetail").getResultList();
    }

    public Department save(Department dep) {
        if (dep.getDeptId() == null) {
            em.persist(dep);
        } else {
            em.merge(dep);
        }
        return dep;
    }

    public void delete(Department dep) {
        Department mergedDep = em.merge(dep);
        em.remove(mergedDep);
    }

}
