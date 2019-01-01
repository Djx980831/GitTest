package com.oracle.dao;

import com.oracle.vo.Emp;
import com.oracle.vo.Role;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface RightDao {

 public List<Emp> select();

 public List<Emp> getEmps(Emp emp);

 public void deletes(int []a);

 public void insert(Emp emp);

 public List<Emp> getLikeSelect(Emp emp);

 public List<Emp> getUsers();

 public List<Role> getRoles();

 public List<Emp> selectById(Emp emp);

 public List<Emp> sortByAny(@Param("name") String name);

}
