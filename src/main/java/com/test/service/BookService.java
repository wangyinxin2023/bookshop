package com.test.service;

import com.test.model.Book;
import com.test.util.PageBean;

import java.util.List;
import java.util.Map;

public interface BookService {
    List<Book> bookList(Book book, PageBean pageBean);
    Map<String,Object> insertSelective(Book record);
    Map<String,Object> updateByPrimaryKeySelective(Book book);
    Map<String,Object> deleteByPrimaryKey(Long bookId);
}
