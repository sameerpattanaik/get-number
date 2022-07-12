package com.example.getNumber.controller;

import com.example.getNumber.serviceimpl.GetNumberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.FileNotFoundException;
import java.util.List;

@RestController
public class NumberController {

    @Autowired
    GetNumberService getNumberService;

    @GetMapping("/getNumber")
    public List<Integer> getNumber() throws FileNotFoundException {
        return getNumberService.numberImpl();
    }

}
