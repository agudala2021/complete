package com.example.restservice;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;

@Service
public class BookAddService {

    // Create new books
    List<Book_Info> BIList = new ArrayList<>();
    public List<Book_Info> AddBook(Book_Info BI) {
        BIList.add(BI);
        return BIList;
    }

    // Show newly inserted books
    public List<Book_Info> getNewBookDetails()
    {
        return BIList;
    }


}


