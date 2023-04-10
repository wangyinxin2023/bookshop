package com.test.service.impl;

import com.test.mapper.BookMapper;
import com.test.model.Book;
import com.test.service.BookService;
import com.test.util.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookMapper bookMapper;
    @Override
    public List<Book> bookList(Book book, PageBean pageBean) {
//        Map<String,Object> map=new HashMap<>();
//        int code=200;
//        String msg="成功";
        List<Book> books = bookMapper.bookList(book);
//        if (books==null||books.size()==0){
//            code=404;
//            msg="无查询结果";
//        }else {
//            map.put("obj",books);
//        }
//        map.put("code",code);
//        map.put("msg",msg);
//        map.put("total",pageBean.getTotal());
//        return map;
        return books;
    }
     @Override
    public Map<String,Object> insertSelective(Book record){
        Map<String,Object> map = new HashMap<>();
         int code=200;
         String msg="新添成功";
        int i = bookMapper.insertSelective(record);
        if (i<=0){
            code=404;
            msg="新添失败";
        }
        map.put("code",code);
        map.put("msg",msg);
        return map;
    }
    @Override
    public Map<String,Object> updateByPrimaryKeySelective(Book book){
        Map<String,Object> map = new HashMap<>();
        int code=200;
        String msg="修改成功";
        int i = bookMapper.updateByPrimaryKeySelective(book);
        if (i<=0){
            code=404;
            msg="修改失败";
        }
        map.put("code",code);
        map.put("msg",msg);
        return map;
    }

    @Override
    public Map<String, Object> deleteByPrimaryKey(Long bookId) {
        Map<String,Object> map = new HashMap<>();
        int code=200;
        String msg="删除成功";
        int i = bookMapper.deleteByPrimaryKey(bookId);
        if (i<=0){
            code=404;
            msg="删除失败";
        }
        map.put("code",code);
        map.put("msg",msg);
        return map;
    }


}
