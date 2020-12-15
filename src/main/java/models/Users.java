package models;

import java.util.Objects;

public class Users {
    private String title;
    private String content;
    private String userid;
    private int id;

    public Users(String title, String content, String userid) {
        this.title = title;
        this.content = content;
        this.userid =userid;
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

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
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
        Users users = (Users) o;
        return id == users.id &&
                Objects.equals(title, users.title) &&
                Objects.equals(content, users.content) &&
                Objects.equals(userid, users.userid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, content, userid, id);
    }
}
