package com.example.getNumber.serviceimpl;

import org.springframework.stereotype.Service;

import java.io.FileNotFoundException;
import java.util.List;


@Service
public interface GetNumber {

    public List<Integer> numberImpl() throws FileNotFoundException;
}
