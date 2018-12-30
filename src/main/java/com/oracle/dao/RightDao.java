package com.oracle.dao;

import com.oracle.vo.Emp;

import java.util.List;

public interface RightDao {

 public List<Emp> select();

 public List<Emp> getEmps(Emp emp);

 public void deletes(int []a);

 public void insert(Emp emp);
}
