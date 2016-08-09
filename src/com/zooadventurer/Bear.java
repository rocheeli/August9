package com.zooadventurer;

public class Bear extends Mammal
{
	private String habitat = null;

	public Bear(String gender, String nickName, float weight, boolean isWarmBlooded, String habitat)
	{
		super(gender, nickName, weight, isWarmBlooded);
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

	@Override
	public String toString()
	{
		return " a bear. This bear lives in the " + habitat + " .It is " + isWarmBlooded() + " that it is warm blooded. It was a  " + getGender()
				+ " and it's nick name was " + getNickName() + ".  It's weight was " + getWeight() + " pounds.";
	}
	
	
	
}
