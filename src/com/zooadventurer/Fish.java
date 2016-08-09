package com.zooadventurer;

public class Fish extends Animal
{
	private String typeOfWater = null;

	public Fish(String gender, String nickName, float weight, String typeOfWater)
	{
		super(gender, nickName, weight);
		this.typeOfWater = typeOfWater;
	}

	public String getTypeOfWater()
	{
		return typeOfWater;
	}

	public void setTypeOfWater(String typeOfWater)
	{
		this.typeOfWater = typeOfWater;
	}
	
	
	
	
	
}
