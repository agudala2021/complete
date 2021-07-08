package com.example.restservice;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.*;

@RestController
public class NewEmpController {

    @Autowired
     NewEmpService NewEmpServ;


    @PostMapping("/Create_Emp")
    public List<Emp_Details> createNewEmp(@RequestBody Emp_Details EmpDet){
        List <Emp_Details> EmpList = NewEmpServ.createNewEmp(EmpDet);
        return EmpList;
    }

    @GetMapping("/Ret_Emp")
    public List<Emp_Details> getEmpdList() {
        List<Emp_Details> EmpdList1 = NewEmpServ.getNewEmpDetails();
        return EmpdList1;
    }

}
