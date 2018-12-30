import com.oracle.dao.RightDao;
import com.oracle.services.Service;
import com.oracle.services.ServiceImpl;
import com.oracle.util.SessionUtil;
import com.oracle.vo.Emp;
import com.oracle.vo.Role;
import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class TestRightTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void test() throws Exception{
        Service service = new ServiceImpl();
        Emp emp = new Emp();
//        emp.setEmpName("关羽");
//        emp.setEmpno("112");
//        emp.setTel("1566543");
//        emp.setRole(new Role(2));
//        emp.setPassword("qwerw");
//
//        service.insert(emp);

        service.deletes(new int[]{2,7});
    }
}