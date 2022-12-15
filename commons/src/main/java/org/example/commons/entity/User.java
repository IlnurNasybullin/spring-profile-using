package org.example.commons.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

public class User {
    private Long id;
    private String name;

    @JsonProperty("id")
    public User id(Long id) {
        this.id = id;
        return this;
    }

    @JsonProperty("id")
    public Long id() {
        return id;
    }

    @JsonProperty("name")
    public User name(String name) {
        this.name = name;
        return this;
    }

    @JsonProperty("name")
    public String name() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(id, user.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }
}
