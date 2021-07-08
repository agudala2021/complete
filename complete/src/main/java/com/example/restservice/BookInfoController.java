package com.example.restservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.awt.print.Book;
import java.util.List;
import java.util.Map;

@RestController
public class BookInfoController {

    @Autowired
    BookInfoService BIService;

    @Autowired
    BookAddService BIAddService;

    @GetMapping("/Book_Details")
    public List<Book_Info> BookInfo(@RequestParam(value = "name", defaultValue = "FivePointSomeone") String name)
    {
        List<Book_Info> BIList = BIService.getBookDetails(name);
        return BIList;
    }

 }



