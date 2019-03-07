package com.project.model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;


public class Party implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private int id;
	private String name;
	private String organizer;
	private String date;
	private String place;
	
	public Party(){
	}

	public Party(int id, String name, String organizer, String date, String place){
	    super();
	    this.id=id;
	    this.name=name;
	    this.organizer=organizer;
	    this.date=date;
	    this.place=place;
	}

	public String getDate() {
		return date;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getOrganizer() {
		return organizer;
	}

	public String getPlace() {
		return place;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setOrganizer(String organizer) {
		this.organizer = organizer;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	@Override
	public String toString() {
		return "Party [id=" + id + ", name=" + name + ", organizer=" + organizer + ", date=" + date + ", place=" + place
				+ "]";
	}
}
