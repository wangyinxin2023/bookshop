package com.test.mapper;

import com.test.model.BookCategory;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface BookCategoryMapper {
    int deleteByPrimaryKey(Integer bookCategoryId);

    int insert(BookCategory record);

    int insertSelective(BookCategory record);

    BookCategory selectByPrimaryKey(Integer bookCategoryId);

    int updateByPrimaryKeySelective(BookCategory record);

    int updateByPrimaryKey(BookCategory record);

    List<BookCategory> CategoryAll();
}