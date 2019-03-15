package com.project.service;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.project.dao.PostDao;
import com.project.dao.PostDaoImpl;
import com.project.model.Post;

public class PostServiceImpl implements PostService {
	PostDao postDao = new PostDaoImpl();
	
	@Override
	public ArrayList<Post> loadAllPosts() {

		String inline = getDataFromURL();
		JSONParser parse = new JSONParser();
		ArrayList<Post> posts = new ArrayList<>();
		try {
			JSONArray jsonArray = (JSONArray) parse.parse(inline);

			for (int i = 0; i < jsonArray.size(); i++) {
				JSONObject jsonObject = (JSONObject) jsonArray.get(i);
				Post post = getPost(jsonObject);
				posts.add(post);
			}
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(postDao.loadAllPosts(posts) > 0)
			return posts;
		else
			return null;
	}

	private String getDataFromURL() {
		System.out.println("Inside the getDatafrom URL");
		String inline = "";

		try {
			URL url = new URL("https://jsonplaceholder.typicode.com/posts");
			HttpURLConnection conn = (HttpURLConnection) url.openConnection();
			conn.setRequestMethod("GET");
			conn.connect();

			int responseCode = conn.getResponseCode();
			System.out.println("The Response code is: " + responseCode);

			if (responseCode != 200) {
				throw new RuntimeException("HttpResponseCode" + responseCode);
			} else {
				// System.out.println("We are in Else Part");
				Scanner in = new Scanner(url.openStream());
				while (in.hasNext()) {
					inline += in.nextLine();
				}
				System.out.println("\nJSON Response in String format");
				// System.out.println(inline);
				in.close();

			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return inline;
	}

	private Post getPost(JSONObject jsonObject) {
		Post post = new Post();
		post.setId((long) jsonObject.get("id"));
		post.setUserId((long) jsonObject.get("userId"));
		post.setTitle((String) jsonObject.get("title"));
		post.setBody((String) jsonObject.get("body"));
		return post;
	}

}
