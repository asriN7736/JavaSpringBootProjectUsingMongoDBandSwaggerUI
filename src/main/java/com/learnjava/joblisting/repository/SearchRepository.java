package com.learnjava.joblisting.repository;

import com.learnjava.joblisting.model.Post;

import java.util.List;

public interface SearchRepository {
    List<Post> findByText(String text);
}
