package com.JavaWEBToDoList.controller;

import com.JavaWEBToDoList.Entity.Deal;
import com.JavaWEBToDoList.Entity.RequestsDB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ToDoListCntrl
{
    private final RequestsDB request;

    @Autowired
    public ToDoListCntrl(RequestsDB request)
    {
        this.request = request;
    }

    @GetMapping
    public String displayInterface(Model m)
    {
        m.addAttribute("rqsts", request.findAll());
        m.addAttribute("rqst", new Deal());
        return "FrontendFile";
    }

    @PostMapping
    public String AnotherDeal(Deal rqst)
    {
        request.save(rqst);
        return "redirect:/";
    }

    @DeleteMapping("/{id}")
    public String delDeal(@PathVariable("id") Long id)
    {
        request.deleteById(id);
        return "redirect:/";
    }
}


