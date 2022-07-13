package com.example.getNumber.controller;

import com.example.getNumber.serviceimpl.GetNumber;
import com.example.getNumber.serviceimpl.impl.GetNumberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.FileNotFoundException;
import java.util.List;

@RestController
public class NumberController {

    @Autowired
    GetNumber getNumber;

    @GetMapping("/getNumber")
    public List<Integer> getNumber() throws FileNotFoundException {
        return getNumber.numberImpl();
    }

}
