package com.test.controller;

import com.test.model.Book;
import com.test.service.BookService;
import com.test.util.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
@CrossOrigin
@RestController
public class BookController {
    @Autowired
    private BookService bookService;
    @RequestMapping("/toselect")
    public Map<String,Object> bookList(Book book, PageBean pageBean){
        Map<String,Object> map=new HashMap<>();
        int code=200;
        String msg="成功";
        List<Book> books = bookService.bookList(book, pageBean);
        if (books==null||books.size()==0){
            code=404;
            msg="无查询结果";
        }else {
            map.put("obj",books);
        }
        map.put("code",code);
        map.put("msg",msg);
        map.put("total",pageBean.getTotal());
        return map;
    }
//      @RequestMapping("/insert")
//    public Map<String,Object> insertSelective(Book record){
//        return bookService.insertSelective(record);
//    }
//    @RequestMapping("/updete")
//    public Map<String,Object> updateByPrimaryKeySelective(Book book){
//        return bookService.updateByPrimaryKeySelective(book);
//    }
    @RequestMapping("editBook")
    public Map<String, Object> insertUP(Book book){
        if (book.getBookId()==null){
            return bookService.insertSelective(book);
        }else{
           return bookService.updateByPrimaryKeySelective(book);
        }
    }
    @RequestMapping("/delete")
    public Map<String, Object> deleteByPrimaryKey(Long bookId) {
        return bookService.deleteByPrimaryKey(bookId);
    }


}
