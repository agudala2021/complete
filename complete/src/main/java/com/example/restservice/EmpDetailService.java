package com.example.restservice;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmpDetailService {
    public List<Emp_Details> getEmpDetails(String name){

    List<Emp_Details> EmpDetails = new ArrayList<Emp_Details>();
    List<Emp_Details> Result_set = new ArrayList<Emp_Details>();

    Emp_Details EmpD1 = new Emp_Details("Tom", "Flaherty", "1111", "Nashua", "BirchHill", "NH", "Architect", 1000,"Yes");
    Emp_Details EmpD2 = new Emp_Details("Jim", "Shally", "1112", "Sharon", "CGI", "MA", "PMO", 2000, "Yes");
    Emp_Details EmpD3 = new Emp_Details("Tori", "Kuketz", "1113", "Norway", "Triverus", "MA", "ETL", 3000, "Yes");
    Emp_Details EmpD4 = new Emp_Details("Ben", "Smith", "1114", "Austin", "Texas Instruments", "TX", "PMO", 4000, "Yes");
    Emp_Details EmpD5 = new Emp_Details("Doug", "Feldman", "1115", "Waltham", "Triverus", "MA", "CTO", 5000, "Yes");

        EmpDetails.add(EmpD1);
        EmpDetails.add(EmpD2);
        EmpDetails.add(EmpD3);
        EmpDetails.add(EmpD4);
        EmpDetails.add(EmpD5);

        for (Emp_Details e : EmpDetails) {
        if (name.equalsIgnoreCase(e.getFirstName()))
        {
            Result_set.add(e);
        }
    }
        return Result_set;
}
}
