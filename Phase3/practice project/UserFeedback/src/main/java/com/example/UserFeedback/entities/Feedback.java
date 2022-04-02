package com.example.UserFeedback.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Feedback {

	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
	private String name;
	private String email;
	private String feedback;
	private int rating;
	
	public Feedback()
	{
		
	}
	public Feedback(Integer id, String name, String email, String feedback, int rating)
	{
		this.id = id;
		this.name = name;
		this.email = email;
		this.feedback = feedback;
		this.rating = rating;
	}
	
	@Override
	public String toString()
	{
		return "<br><h3>" + name + " [" + id + "]" + email + " commented:</h3><h4>\"" + feedback + "\"  and rated: " + rating + "</h4><br>";
	}
}
