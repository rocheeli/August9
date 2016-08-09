package com.zooadventurer;

public class Flamingo extends Bird
{
	private String color = null;

	public Flamingo(String gender, String nickName, float weight, float wingSpan, String color)
	{
		super(gender, nickName, weight, wingSpan);
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
		return " a flamingo.  It was  " + color + ".  It's wing span was " + getWingSpan() + ".  It was a " + getGender()
				+ " and it's nick name was " + getNickName() + ".  It's weight was " + getWeight() + " pounds.";
	}
	
	
	
}
