package com.project.model;

public class Post {
	long id;
	long userId;
	String title;
	String body;

	public Post() {
		super();
	}

	public Post(int id, int userId, String title, String body) {
		super();
		this.id = id;
		this.userId = userId;
		this.title = title;
		this.body = body;
	}

	public String getBody() {
		return body;
	}

	public long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public long getUserId() {
		return userId;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	@Override
	public String toString() {
		return "Post [id=" + id + ", userId=" + userId + ", title=" + title + ", body=" + body + "]";
	}
}
