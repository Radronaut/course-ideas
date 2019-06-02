package com.teamtreehouse.courses.com.teamtreehouse.courses.model;

import java.util.Objects;

public class CourseIdea {

    private String creator;
    private String title;

    public CourseIdea(String title, String creator) {
        this.creator = creator;
        this.title = title;
    }

    public String getCreator() {
        return creator;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CourseIdea that = (CourseIdea) o;
        return Objects.equals(creator, that.creator) &&
                Objects.equals(title, that.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(creator, title);
    }
}
