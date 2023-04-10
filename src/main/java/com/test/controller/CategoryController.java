package com.test.controller;

import com.test.service.IBookCategory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@CrossOrigin
public class CategoryController {
    @Autowired
    private IBookCategory iBookCategory;
    @RequestMapping("/queryCategory")
    public Map<String,Object> CategoryAll(){
        return iBookCategory.CategoryAll();
    }
}
