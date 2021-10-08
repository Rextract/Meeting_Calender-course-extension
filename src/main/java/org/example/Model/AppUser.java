package org.example.Model;


import java.util.Objects;

public class AppUser {

    private int id;
    private String username;
    private String password;


    public AppUser(int id, String username, String password) {
        this.id = id;
        setUsername(username);
        setPassword(password);

    }

    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        if (username == null)
            throw new RuntimeException("Username was null or empty");

        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (password == null)
            throw new RuntimeException("Password was null or empty");

        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AppUser appUser = (AppUser) o;
        return id == appUser.id && Objects.equals(username, appUser.username) && Objects.equals(password, appUser.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, username, password);
    }
}
