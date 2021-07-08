package com.example.restservice;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class NewEmpService {

    List<Emp_Details> EmpDetails = new ArrayList<>();
    public List<Emp_Details> createNewEmp(Emp_Details Emp) {
        EmpDetails.add(Emp);
        return EmpDetails;
    }

    public List<Emp_Details> getNewEmpDetails()
    {
        return EmpDetails;
    }

}


