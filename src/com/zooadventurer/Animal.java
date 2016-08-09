package com.zooadventurer;

public class Animal
{
	private String gender = null;
	private String nickName = null;
	private float weight = 0.0f;
	
	
	public Animal(String gender, String nickName, float weight)
	{
		this.gender = gender;
		this.nickName = nickName;
		this.weight = weight;
	}


	public String getGender()
	{
		return gender;
	}


	public void setGender(String gender)
	{
		this.gender = gender;
	}


	public String getNickName()
	{
		return nickName;
	}


	public void setNickName(String nickName)
	{
		this.nickName = nickName;
	}


	public float getWeight()
	{
		return weight;
	}


	public void setWeight(float weight)
	{
		this.weight = weight;
	}
	
	
	
}
