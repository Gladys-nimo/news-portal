package models;

import java.util.Objects;

public class DepartmentNews extends News {
    private int departmentId;

    public DepartmentNews(String title, String content, int userid, int departmentId) {
        super(title, content, userid);
        this.departmentId = departmentId;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        DepartmentNews that = (DepartmentNews) o;
        return departmentId == that.departmentId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), departmentId);
    }
}