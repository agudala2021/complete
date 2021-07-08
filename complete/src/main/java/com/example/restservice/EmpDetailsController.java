package com.example.restservice;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmpDetailsController {

    @Autowired
    EmpDetailService EmpdService;

    @Autowired
    SalaryService SalService;

    @GetMapping("/Emp_Details")
    public List<Emp_Details> EmpDetails(@RequestParam(value = "name", defaultValue = "Tom") String name) {
        List<Emp_Details> EmpDetailsList = EmpdService.getEmpDetails(name);
        return EmpDetailsList;
    }

    @GetMapping("/Emp_Details_Sal")
    public Map<String, Integer> EmpSalDetails(@RequestParam(value = "name", defaultValue = "Tom") String name) {
        Map<String, Integer> EmpSalDet = SalService.getEmpSalDetails(name);
        return EmpSalDet;
    }
}



