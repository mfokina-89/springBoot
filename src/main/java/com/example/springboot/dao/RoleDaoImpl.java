package com.example.springboot.dao;

import com.example.springboot.model.Role;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class RoleDaoImpl implements RoleDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Role> getAllRoles() {
        return entityManager.createQuery("select r FROM Role r", Role.class).getResultList();
    }

    @Override
    public Role getByIdRole(int id) {
        return entityManager.find(Role.class, id);
    }

    @Override
    public Role getByName(String role) {
        TypedQuery<Role> query = entityManager.createQuery(
                "SELECT role FROM Role role WHERE role.role = :role", Role.class
        );
        return query
                .setParameter("role", role)
                .getSingleResult();
    }
}

