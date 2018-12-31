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
//        //emp.setEmpName("詹");
//        emp.setEmpName("曹操");
//        emp.setEmpno("114");
//        emp.setTel("1822323");
//        emp.setRole(new Role(2));
//        emp.setPassword("987654");
//
//        service.insert(emp);

//       List<Emp> list = service.getLikeSelect(emp);
//       for(Emp e : list){
//           System.out.println(e);
//       }

//        List<Emp> list = service.getUsers();
//        for(Emp e : list){
//            System.out.println(e);
//            System.out.println("---------");
//        }

//        List<Role> list = service.getRoles();
//        System.out.println("总的部门数："+list.size());
//        for(Role r : list){
//            System.out.println(r+" "+r.getEmp());
//            System.out.println("-----------");
//        }

        //emp.setEmpid(1);
        List<Emp> list = service.selectById(emp);
        for(Emp e : list){
            System.out.println(e);
        }
    }
}