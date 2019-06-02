package com.teamtreehouse.courses.com.teamtreehouse.courses.model;

import java.util.List;

public interface CourseIdeaDAO {
    boolean add(CourseIdea courseIdea);

    List<CourseIdea> findAll();
}
