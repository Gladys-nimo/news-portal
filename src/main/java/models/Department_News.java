package models;

import java.util.Objects;

public class Department_News extends News {
    private String news_type;
    private int departmentId;

//    private final TYPE_OF_NEWS = "departments";

    public Department_News(String title, String content, int user_id, String news_type, int departmentId) {
        super(title, content, user_id);
        this.news_type = news_type;
        this.departmentId = departmentId;
//        this.news_type = TYPE_OF_NEWS;
    }

    public Department_News(String title, String content, int departmentId, int user_id, String news_type, int department_id) {
        super(title, content, departmentId, user_id);
        this.news_type = news_type;
        this.departmentId = departmentId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Department_News that = (Department_News) o;
        return departmentId == that.departmentId &&
                Objects.equals(news_type, that.news_type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), news_type, departmentId);
    }
}
