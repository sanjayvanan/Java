package com.register_form.thyme;

import java.sql.Date;

public class user {
	
	private String name;
	private String email;
	private String pass_word;
	private Date birth_date;
	private String profession;
	private boolean married;
	private String gender;
	private String comment;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPass_word() {
		return pass_word;
	}
	public void setPass_word(String pass_word) {
		this.pass_word = pass_word;
	}
	public Date getBirth_date() {
		return birth_date;
	}
	public void setBirth_date(Date birth_date) {
		this.birth_date = birth_date;
	}
	public String getProfession() {
		return profession;
	}
	public void setProfession(String profession) {
		this.profession = profession;
	}
	public boolean isMarried() {
		return married;
	}
	public void setMarried(boolean married) {
		this.married = married;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	@Override
	public String toString() {
		return "user [name=" + name + ", email=" + email + ", pass_word=" + pass_word + ", birth_date=" + birth_date
				+ ", profession=" + profession + ", married=" + married + ", gender=" + gender + ", comment=" + comment
				+ "]";
	}
	
	
	

}
