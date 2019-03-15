package com.project.controller;

import java.util.ArrayList;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.project.model.Post;
import com.project.service.PostService;
import com.project.service.PostServiceImpl;

@Path("/posts")
public class PostResource {
	PostService postService = new PostServiceImpl();
	
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public ArrayList<Post> loadPosts(){
		return postService.loadAllPosts();
	}
}
