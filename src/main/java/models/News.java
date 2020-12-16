package models;

import java.util.Objects;

public class News {
    private String news_type;
    private  String title;
    private  String content;
    private int departmentId;
    private  int user_id;
    private int id;
//    private final TYPE_OF_NEWS ="general";



    public News(String title, String content, int user_id ) {
        this.title = title;
        this.content = content;
        this.user_id = user_id;
//        this.news_type = TYPE_OF_NEWS;
        this.departmentId =0;
    }

    public News(String title, String content, int departmentId, int user_id) {
        this.title = title;
        this.content = content;
        this.user_id = user_id;
        this.departmentId = departmentId;
        this.news_type ="department;";
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getNews_type() {
        return news_type;
    }

    public void setNews_type(String news_type) {
        this.news_type = news_type;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        News news = (News) o;
        return departmentId == news.departmentId &&
                user_id == news.user_id &&
                id == news.id &&
                Objects.equals(news_type, news.news_type) &&
                Objects.equals(title, news.title) &&
                Objects.equals(content, news.content);
//                Objects.equals(TYPE_OF_NEWS, news.TYPE_OF_NEWS);

    }

    @Override
    public int hashCode() {
        return Objects.hash(news_type, title, content, departmentId, user_id, id);
    }
}
