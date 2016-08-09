package com.zooadventurer;

public class Koi extends Fish
{
	private String color = null;

	public Koi(String gender, String nickName, float weight, String typeOfWater, String color)
	{
		super(gender, nickName, weight, typeOfWater);
		this.color = color;
	}

	public String getColor()
	{
		return color;
	}

	public void setColor(String color)
	{
		this.color = color;
	}

	@Override
	public String toString()
	{
		return " a koi.  It was " + color + ".  It lives in  " + getTypeOfWater() + " water.  It was a " + getGender()
				+ " and it's nick name was " + getNickName() + ".  It weighed " + getWeight() + " pounds.";
	}
	
	
	
	
	
}
