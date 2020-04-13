package com.senior.bpmapi.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_code")
    private Long code;

    @Column(name = "user_name")
    private String name;

    @Column(name = "user_permission")
    private boolean permission;

    @Column(name = "user_password")
    private String password;

    public User() {
    }

    public Long getCode() {

        return code;
    }

    public void setCode(Long code) {

        this.code = code;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public boolean isPermission() {

        return permission;
    }

    public void setPermission(boolean permissao) {

        this.permission = permissao;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return code.equals(user.code);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code);
    }
}
