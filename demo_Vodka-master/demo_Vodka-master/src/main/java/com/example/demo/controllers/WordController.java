package com.example.demo.controllers;

import com.example.demo.models.Word;
import com.example.demo.services.WordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class WordController {
    @Autowired
    private WordService wordService;

    // display list of user

    @GetMapping("/")
    public String viewHomePage(Model model){
        List<Word> wordList = wordService.getAllWord();
        model.addAttribute("listwords",wordList);
        return "index";
    }
}
