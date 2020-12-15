package models;

import java.util.Objects;

public class News {
    private  String title;
    private  String content;
    private  int userid;
    private int id;



    public News(String title, String content, int userid) {
        this.title = title;
        this.content = content;
        this.userid = userid;

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

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
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
        return userid == news.userid &&
                id == news.id &&
                Objects.equals(title, news.title) &&
                Objects.equals(content, news.content);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, content, userid, id);
    }
}
