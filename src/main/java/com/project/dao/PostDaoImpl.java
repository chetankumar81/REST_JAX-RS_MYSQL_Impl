package com.project.dao;

import java.util.ArrayList;

import com.project.database.DatabaseAccess;
import com.project.model.Post;

public class PostDaoImpl implements PostDao {

	@Override
	public int loadAllPosts(ArrayList<Post> posts) {
		return new DatabaseAccess().loadAllPosts(posts);
	}

}
