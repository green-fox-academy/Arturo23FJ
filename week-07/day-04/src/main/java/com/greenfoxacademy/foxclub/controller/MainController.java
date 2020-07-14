package com.greenfoxacademy.foxclub.controller;

import com.greenfoxacademy.foxclub.service.FoxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class MainController {
    FoxService foxService;

    @Autowired
    public MainController(FoxService foxService){
        this.foxService = foxService;
    }

    @GetMapping("/")
    public String mainPage(Model model){
        model.addAttribute("fox", foxService.getFox());
        return "index";
    }

    @GetMapping("/login")
    public String getLoginPage(){
        return "login";
    }

    @PostMapping("/login")
    public String postLogin(@RequestParam(value = "name", defaultValue = "") String name){
        if (foxService.doesListContainFoxname(name)){
            return "redirect:/?name=" + name;
        } else {
            foxService.createAndAddFoxToList(name);
        }
        return "redirect:/?name=" + name;
    }

    @GetMapping("/?name=*")
    public String getName(Model model){
        model.addAttribute("fox", foxService.getFox());
        return "index";
    }
}
