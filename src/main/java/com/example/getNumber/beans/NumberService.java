package com.example.getNumber.beans;

import com.example.getNumber.serviceimpl.GetNumberService;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.FileNotFoundException;
import java.util.List;

public class NumberService {
    private int serviceImpl;
    @Autowired
    GetNumberService getNumberService;

    public NumberService(int serviceImpl) {
        this.serviceImpl = serviceImpl;
    }

    public List<Integer> getServiceImpl() throws FileNotFoundException {
        return getNumberService.numberImpl();
    }

    public void setServiceImpl(int serviceImpl) {
        this.serviceImpl = serviceImpl;
    }
}
