package com.example.restservice;

import org.springframework.stereotype.Service;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;

@Service
public class BookInfoService {
    public List<Book_Info> getBookDetails(String name){

        List<Book_Info> BookInfo = new ArrayList<Book_Info>();

        Book_Info BI1 = new Book_Info("Kafka","Neha Narkhede","Oreilly","1491936169","2017","450");
        Book_Info BI2 = new Book_Info("FivePointSomeone","Chethan Bhagat","Oreilly","81-291-0459-8","2004","500");
        Book_Info BI3 = new Book_Info("Kafka","Neha Narkhede","Oreilly","1491936169","2017","450");
        Book_Info BI4 = new Book_Info("FivePointSomeone","Chethan Bhagat","Oreilly","81-291-0459-8","2004","500");

        BookInfo.add(BI1);
        BookInfo.add(BI2);

        List<Book_Info> BookInfo_Res = new ArrayList<Book_Info>();

        for (Book_Info e : BookInfo) {
            if (name.equalsIgnoreCase(e.getBookTitle()))
            {
                BookInfo_Res.add(e);
            }
        }
        return BookInfo_Res;
    }

}
