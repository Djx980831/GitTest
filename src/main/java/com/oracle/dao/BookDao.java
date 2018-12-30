package com.oracle.dao;

import com.oracle.vo.Book;

import java.util.List;
import java.util.Map;

public interface BookDao {

    public void save(Book book);
    public List<Book> select();
    public List<Map<String,Object>> getWriter();

}
