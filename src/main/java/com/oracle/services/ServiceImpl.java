package com.oracle.services;

import com.oracle.dao.RightDao;
import com.oracle.util.SessionUtil;
import com.oracle.vo.Emp;
import org.apache.ibatis.session.SqlSession;

import java.util.Collections;
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
}
