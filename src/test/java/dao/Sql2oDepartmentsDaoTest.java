//package dao;
//
//import org.junit.After;
//import org.junit.Before;
//import org.sql2o.*;
//
//import java.sql.Connection;
//
//import static org.junit.Assert.*;
//
//public class Sql2oDepartmentsDaoTest {
//    private static Sql2oDepartmentsDao departmentsDao;
//    private static Sql2oUsersDao usersDao;
//    private static Sql2oNewsDao newsDao;
//    private static Connection connection;
//
//    @Before
//    public void setUp() throws Exception {
//        String connectionString = "jdbc:postgresql://localhost:5432/newsreport_test";
//        Sql2o sql2o = new Sql2o(connectionString, null, null); // changed user and pass to null
//        DepartmentsDao = new Sql2oDepartmentsDao(sql2o);
//        usersDao = new Sql2oUsersDao (sql2o);
//        NewsDao = Sql2oNewsDao (sql2o);
//        connection = sql2o.open();
//    }
//
//    @After
//    public void tearDown() throws Exception {
//    }
//}