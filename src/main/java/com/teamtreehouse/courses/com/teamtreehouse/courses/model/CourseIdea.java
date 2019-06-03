package com.teamtreehouse.courses.com.teamtreehouse.courses.model;

import com.github.slugify.Slugify;

import java.util.*;

public class CourseIdea {

    private final String slug;
    private String creator;
    private String title;
    private Set<String> voters;

    public CourseIdea(String title, String creator) {
        voters = new HashSet<>();
        this.creator = creator;
        this.title = title;
        Slugify slugify = new Slugify();
        slug = slugify.slugify(title);
    }

    public String getCreator() {
        return creator;
    }

    public String getTitle() { return title; }

    public String getSlug() {
        return slug;
    }

    public boolean addVoter(String voterUserName) {
        return voters.add(voterUserName);
    }

    public List<String> getVoters() {
        return new ArrayList<>(voters);
    }
    public int getVoteCount() {
        return voters.size();
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
