package com.example.demo.services;

import com.example.demo.models.Role;
import com.example.demo.models.Word;

import java.util.List;

public interface RoleService  {
    List<Role> getAllRole();
    void saveRole(Role role);
   Role getRoleById(long id);
    void deleteRoleById(long id);
}
