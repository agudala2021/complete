package com.example.restservice;

import org.springframework.stereotype.Service;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;

@Service
public class BookAddService {

    List<Book_Info> BIList = new ArrayList<>();
    public List<Book_Info> AddBook(Book_Info BI) {
        BIList.add(BI);
        return BIList;
    }

    public List<Book_Info> getNewBookDetails()
    {
        return BIList;
    }

}


