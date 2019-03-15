package com.project.dao;

import java.util.ArrayList;

import com.project.model.Post;

public interface PostDao {

	int loadAllPosts(ArrayList<Post> posts);

}
