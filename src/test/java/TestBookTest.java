import com.oracle.dao.BookDao;
import com.oracle.util.SessionUtil;
import com.oracle.vo.Book;
import org.apache.ibatis.session.SqlSession;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class TestBookTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void test() throws Exception {
        SqlSession session = SessionUtil.openSession();
        BookDao dao = session.getMapper(BookDao.class);

        Book book = new Book();

//        book.setBookName("詹姆斯的传奇人生");
//        book.setPrice(99);
//
//        dao.save(book);

//        List<Book> list = dao.select();
//        for(Book b : list){
//            System.out.println(b);
//        }

        List<Map<String,Object>> lists = new ArrayList<Map<String,Object>>();

        lists = dao.getWriter();

        for(Map<String,Object> list : lists){
            System.out.println(list);
        }


        session.commit();
        session.close();
    }
}