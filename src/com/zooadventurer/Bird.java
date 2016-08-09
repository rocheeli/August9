package com.zooadventurer;

public class Bird extends Animal
{
	private float wingSpan = 0.0f;

	public Bird(String gender, String nickName, float weight, float wingSpan)
	{
		super(gender, nickName, weight);
		this.wingSpan = wingSpan;
	}

	public float getWingSpan()
	{
		return wingSpan;
	}

	public void setWingSpan(float wingSpan)
	{
		this.wingSpan = wingSpan;
	}
	
	
	
}
