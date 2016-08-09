package com.zooadventurer;

public class Mammal extends Animal
{
	private boolean isWarmBlooded = false;

	public Mammal(String gender, String nickName, float weight, boolean isWarmBlooded)
	{
		super(gender, nickName, weight);
		this.isWarmBlooded = isWarmBlooded;
	}

	public boolean isWarmBlooded()
	{
		return isWarmBlooded;
	}

	public void setWarmBlooded(boolean isWarmBlooded)
	{
		this.isWarmBlooded = isWarmBlooded;
	}
	
	
	
	
	
	
}
