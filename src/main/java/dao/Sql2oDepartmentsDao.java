package dao;

import models.Departments;
import org.sql2o.Connection;
import org.sql2o.Sql2o;
import org.sql2o.Sql2oException;


import java.util.List;

public class Sql2oDepartmentsDao implements DepartmentsDao {

    private final Sql2o sql2o;

    public Sql2oDepartmentsDao(Sql2o sql2o) {
        this.sql2o = sql2o;
    }

    @Override
    public void add(Departments departments) {
        String sql = "INSERT INTO departments (name, description, numOfEmployee) VALUES (:name, :description, :numOfEmployee)"; //if you change your model, be sure to update here as well!
        try (Connection con = sql2o.open()) {
            int id = (int) con.createQuery(sql, true)
                    .bind(departments)
                    .executeUpdate()
                    .getKey();
            departments.setId(id);
        } catch (Sql2oException ex) {
            System.out.println(ex);
        }

    }

    @Override
    public List<Departments> getAllDepartments() {
        try (Connection con = sql2o.open()) {
            return con.createQuery("SELECT * FROM departments")
                    .executeAndFetch(Departments.class);
        }
    }

    @Override
    public Departments findById(int id) {
        String sql ="select * from departments where id=:id";
        try(Connection con = sql2o.open()){
            return con.createQuery(sql)
                    .addParameter("id",id)
                    .executeAndFetchFirst(Departments.class);
        }
    }

    @Override
    public void clearAll() {
        String sql =" delete from departments";
        try(Connection con = sql2o.open()){
            con.createQuery(sql).executeUpdate();
        }

    }
}
