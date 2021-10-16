package com.example.springboot.service;
import com.example.springboot.model.Role;

import java.util.List;

public interface RoleService {
    List<Role> getAllRoles();
    Role getByIdRole(int id);
    Role getByName (String role);
}