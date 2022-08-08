package com.example.demo.controllers;

import com.example.demo.models.Role;
import com.example.demo.services.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class RoleController {
    @Autowired
    private RoleService roleService;

    @GetMapping("/role")
    public String getViewRole(Model model){
        List<Role> listRole= roleService.getAllRole();
        model.addAttribute("listRole",listRole);
        return  "role";
    }

    @GetMapping("/test")
    public String getTest(){

        return "test";
    }

}
