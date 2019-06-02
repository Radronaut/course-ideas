package com.teamtreehouse.courses.com.teamtreehouse.courses.model;

import java.util.ArrayList;
import java.util.List;

public class SimpleCourseIdeaDAO implements CourseIdeaDAO{
    private List<CourseIdea> ideas;

    public SimpleCourseIdeaDAO() {
        ideas = new ArrayList<>();

    }

    @Override
    public boolean add(CourseIdea courseIdea) {
        return ideas.add(courseIdea);
    }

    @Override
    public List<CourseIdea> findAll() {
        return new ArrayList<>(ideas);
    }
}