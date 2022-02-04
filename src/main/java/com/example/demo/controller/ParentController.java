package com.example.demo.controller;

import com.example.demo.entity.ParentClass;
import com.example.demo.repository.ParentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ParentController {

    @Autowired
    ParentRepository repo;

    @GetMapping("/parent/books")
    public List<ParentClass> getAllBooks()
    {
        return repo.findAll();
    }
}
