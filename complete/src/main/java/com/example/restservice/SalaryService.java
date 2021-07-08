package com.example.restservice;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class SalaryService {
    public Map<String, Integer> getEmpSalDetails(String name){

        List<Emp_Details> EmpDetails = new ArrayList<Emp_Details>();


        Map<String, Integer> salaryDetail = new HashMap<>();
        for (Emp_Details e : EmpDetails) {
            if (name.equalsIgnoreCase(e.getFirstName())) {

                salaryDetail.put(e.getFirstName(),e.getSalary());
            }
        }
        return salaryDetail;
    }
}
