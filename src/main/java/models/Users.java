package models;

import java.util.Objects;

public class Users {
    private String name;
    private String position;
    private String role;
    private int id;

    public Users(String name, String position, String role) {
        this.name = name;
        this.position = position;
        this.role = role;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
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
                Objects.equals(name, users.name) &&
                Objects.equals(position, users.position) &&
                Objects.equals(role, users.role);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, position, role, id);
    }
}
