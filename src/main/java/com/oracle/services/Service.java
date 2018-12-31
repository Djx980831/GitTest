package com.oracle.services;

import com.oracle.vo.Emp;
import com.oracle.vo.Role;

import java.util.List;

public interface Service {

    public List<Emp> select();

    public List<Emp> getEmps(Emp emp);

    public void deletes(int []a);

    public void insert(Emp emp);

    public List<Emp> getLikeSelect(Emp emp);

    public List<Emp> getUsers();

    public List<Role> getRoles();
}
