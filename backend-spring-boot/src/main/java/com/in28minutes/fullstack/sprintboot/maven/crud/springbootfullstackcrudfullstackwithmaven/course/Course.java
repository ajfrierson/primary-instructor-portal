package com.in28minutes.fullstack.sprintboot.maven.crud.springbootfullstackcrudfullstackwithmaven.course;

import java.util.Objects;

public class Course {
    private Long Id;
    private String username;
    private String description;

    public Course() {
    }

    public Course(Long id, String username, String description) {
        Id = id;
        this.username = username;
        this.description = description;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return Id.equals(course.Id) && username.equals(course.username) && description.equals(course.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Id, username, description);
    }
}
