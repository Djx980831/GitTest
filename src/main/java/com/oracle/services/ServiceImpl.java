package com.oracle.services;

import com.oracle.dao.RightDao;
import com.oracle.util.SessionUtil;
import com.oracle.vo.Emp;
import com.oracle.vo.Role;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class ServiceImpl implements Service {


    @Override
    public List<Emp> select() {
        SqlSession session = SessionUtil.openSession();
        RightDao dao = session.getMapper(RightDao.class);
        List<Emp> list = dao.select();
        session.close();
        return list;
    }

    @Override
    public List<Emp> getEmps(Emp emp) {
        SqlSession session = SessionUtil.openSession();
        RightDao dao = session.getMapper(RightDao.class);
        List<Emp> list = dao.getEmps(emp);
        session.close();
        return list;
    }

    @Override
    public void deletes(int[] a) {
        SqlSession session = SessionUtil.openSession();
        try{
            RightDao dao = session.getMapper(RightDao.class);
            dao.deletes(a);
            session.commit();
        }catch (Exception e){
            System.out.println("删除失败。");
            session.rollback();
        }finally {
            session.close();;
        }
    }

    @Override
    public void insert(Emp emp) {
        SqlSession session = SessionUtil.openSession();
        try{
            RightDao dao = session.getMapper(RightDao.class);
            dao.insert(emp);
            session.commit();
        }catch (Exception e){
            System.out.println("新增失败。");
            session.rollback();
        }finally {
            session.close();;
        }
    }

    @Override
    public List<Emp> getLikeSelect(Emp emp) {
        SqlSession session = SessionUtil.openSession();
        RightDao dao = session.getMapper(RightDao.class);
        List<Emp> list = dao.getLikeSelect(emp);
        session.close();
        return list;
    }

    @Override
    public List<Emp> getUsers() {
        SqlSession session = SessionUtil.openSession();
        RightDao dao = session.getMapper(RightDao.class);
        List<Emp> list = dao.getUsers();
        session.close();
        return list;
    }

    @Override
    public List<Role> getRoles() {
        SqlSession session = SessionUtil.openSession();
        RightDao dao = session.getMapper(RightDao.class);
        List<Role> list = dao.getRoles();
        session.close();
        return list;
    }

    @Override
    public List<Emp> selectById(Emp emp) {
        SqlSession session = SessionUtil.openSession();
        RightDao dao = session.getMapper(RightDao.class);
        List<Emp> list = dao.selectById(emp);
        session.close();
        return list;
    }

    @Override
    public List<Emp> sortByAny(String value) {
        SqlSession session = SessionUtil.openSession();
        RightDao dao = session.getMapper(RightDao.class);
        List<Emp> list = dao.sortByAny(value);
        session.close();
        return list;
    }


}
