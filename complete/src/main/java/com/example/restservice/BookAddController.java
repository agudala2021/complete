package com.example.restservice;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.*;

@RestController
public class BookAddController {

    @Autowired
    BookAddService BAddServ;

    @PostMapping("/Add_Book")
    public List<Book_Info> AddNewBook(@RequestBody Book_Info BInfo){
        List <Book_Info> BIList = BAddServ.AddBook(BInfo);
        return BIList;
    }

    @GetMapping("/Ret_Book")
    public List<Book_Info> getNewBookDet() {
        List<Book_Info> BIList = BAddServ.getNewBookDetails();
        return BIList;
    }
}
