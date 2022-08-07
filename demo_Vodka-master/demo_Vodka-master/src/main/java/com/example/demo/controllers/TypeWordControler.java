package com.example.demo.controllers;

import com.example.demo.models.TypeWord;
import com.example.demo.services.TypeWordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class TypeWordControler {

    @Autowired
    private TypeWordService typeWordService;

    @GetMapping("typeword")
    public String viewList(Model model){
        List<TypeWord> typeWordList= typeWordService.getAllTypeWord();
        model.addAttribute("listType",typeWordList);
        return  "typeword";
    }
}
