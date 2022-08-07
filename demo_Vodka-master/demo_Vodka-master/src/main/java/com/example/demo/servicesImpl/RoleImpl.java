package com.example.demo.servicesImpl;

import com.example.demo.models.Role;
import com.example.demo.repositories.RoleRepository;
import com.example.demo.services.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RoleImpl  implements RoleService {
    @Autowired
    private RoleRepository roleRepository;
    @Override
    public List<Role> getAllRole() {
        return roleRepository.findAll();
    }

    @Override
    public void saveRole(Role role) {

    }

    @Override
    public Role getRoleById(long id) {
        return null;
    }

    @Override
    public void deleteRoleById(long id) {

    }
}
