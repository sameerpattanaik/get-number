package com.example.getNumber.service;

import org.springframework.stereotype.Service;

import java.io.FileNotFoundException;
import java.util.List;


@Service
public interface GetNumberService {

    List<Integer> getNumbersFromFile() throws FileNotFoundException;
}
