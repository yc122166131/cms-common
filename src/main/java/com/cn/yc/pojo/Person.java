package com.cn.yc.pojo;

import java.io.Serializable;
import java.util.Arrays;

public class Person implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1056590450561540140L;

	private String username;
	private int age;
	private String address;
	private String hobby;
	private String[] scores;
	private double weight;
	private Boolean sex;
	
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Person(String username, int age, String address, String hobby,
			String[] scores, double weight, Boolean sex) {
		super();
		this.username = username;
		this.age = age;
		this.address = address;
		this.hobby = hobby;
		this.scores = scores;
		this.weight = weight;
		this.sex = sex;
	}

	


	public Person(String username, int age, Boolean sex) {
		super();
		this.username = username;
		this.age = age;
		this.sex = sex;
	}


	public String[] getScores() {
		return scores;
	}

	public void setScores(String[] scores) {
		this.scores = scores;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public Boolean getSex() {
		return sex;
	}

	public void setSex(Boolean sex) {
		this.sex = sex;
	}

	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getHobby() {
		return hobby;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

	@Override
	public String toString() {
		return "Person [username=" + username + ", age=" + age + ", address="
				+ address + ", hobby=" + hobby + ", scores="
				+ Arrays.toString(scores) + ", weight=" + weight + ", sex="
				+ sex + "]";
	}
	
	
	
	
	
}
