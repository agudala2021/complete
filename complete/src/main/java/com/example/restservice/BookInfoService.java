package com.example.restservice;

import org.springframework.stereotype.Service;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;

@Service
public class BookInfoService {
    public List<Book_Info> getBookDetails(String name)
    {
        List<Book_Info> BookInfo = new ArrayList<Book_Info>();
        Book_Info BI1 = new Book_Info("Kafka","Neha Narkhede","Oreilly","1491936169","2017","450");
        Book_Info BI2 = new Book_Info("FivePointSomeone","Chethan Bhagat","Oreilly","81-291-0459-8","2004","500");
        Book_Info BI3 = new Book_Info("JavaCompleteReference","Herbet Schildt","McGrawHill","91-291-0459-8","2007","300");
        BookInfo.add(BI1);
        BookInfo.add(BI2);
        BookInfo.add(BI3);
        List<Book_Info> BookInfo_Res = new ArrayList<Book_Info>();
        for (Book_Info e : BookInfo) {
            if (name.equalsIgnoreCase(e.getBookTitle()))
            {
                BookInfo_Res.add(e);
            }
        }
        return BookInfo_Res;
    }

    public List<Book_Info> getBookCostDetails(String Cost)
    {
        List <Book_Info> BookInfo1 = new ArrayList<Book_Info>();
        Book_Info BI1 = new Book_Info("DB","DBGuru","Oreilly","1491936169","2017","450");
        Book_Info BI2 = new Book_Info("DWH","DWHGuru","Oreilly","81-291-0459-8","2004","300");
        Book_Info BI3 = new Book_Info("Informatica","Infa9","Infa","8-7291-0459-8","2009","300");

        BookInfo1.add(BI1);
        BookInfo1.add(BI2);
        BookInfo1.add(BI3);

        List <Book_Info> BookCost_Res = new ArrayList<Book_Info>();
        for (Book_Info b :BookInfo1){
            if (Cost.equals(b.getCost()))
            {
                BookCost_Res.add(b);
            }
        }
        return BookCost_Res;
    }

}
