package com.devam.FlywayApp.Controller;

import com.devam.FlywayApp.Model.BasicData;
import com.devam.FlywayApp.Repository.FWAppRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class MainController {

    @Autowired
    private FWAppRepo fwAppRepo;

    //To show all entries
    @GetMapping("/all")
    public String showAllEntries(Model model){
        model.addAttribute("entries", fwAppRepo.findAll());
        return "entries"; //returns the entries.html in templates
    }

    //To show add entries form
    @GetMapping("/add")
    public String showAddForm(Model model){
        model.addAttribute("basicData" , new BasicData());
        return "add-entry"; //returns add-entries.html from templates
    }
    //Submit new entry
    @PostMapping("/add")
    public String addEntry(@ModelAttribute BasicData basicData){
        fwAppRepo.save(basicData);
        return  "redirect:/all";
    }

}
