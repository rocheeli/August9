package com.zooadventurer;

public class Reptile extends Animal
{
	private String habitat = null;

	public Reptile(String gender, String nickName, float weight, String habitat)
	{
		super(gender, nickName, weight);
		this.habitat = habitat;
	}

	public String getHabitat()
	{
		return habitat;
	}

	public void setHabitat(String habitat)
	{
		this.habitat = habitat;
	}
	
	
	
}
