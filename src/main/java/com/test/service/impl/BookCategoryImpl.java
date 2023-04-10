package com.test.service.impl;

import com.test.mapper.BookCategoryMapper;
import com.test.model.BookCategory;
import com.test.service.IBookCategory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Service
public class BookCategoryImpl implements IBookCategory {
    @Autowired
    private BookCategoryMapper bookCategoryMapper;
    @Override
    public Map<String, Object> CategoryAll() {
        Map<String,Object> map=new HashMap<>();
        int code=200;
        String msg="操作成功";
        List<BookCategory> categories = bookCategoryMapper.CategoryAll();
        if (categories==null&&categories.size()==0){
            code=909;
            msg="没有数据";
        }else {
            map.put("obj",categories);
        }
        map.put("code",code);
        map.put("msg",msg);
        return map;
    }
}
