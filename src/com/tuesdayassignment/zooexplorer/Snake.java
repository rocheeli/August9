package com.tuesdayassignment.zooexplorer;

public class Snake extends Animal
{
	protected float length = 0.0f;
	protected boolean isVenomous = false;
	
	public Snake(String species, String color, boolean isAMammal, int age, String gender, String animalsName,
			float length, boolean isVenomous)
	{
		super(species, color, isAMammal, age, gender, animalsName);
		this.length = length;
		this.isVenomous = isVenomous;
	}

	public float getLength()
	{
		return length;
	}

	public void setLength(float length)
	{
		this.length = length;
	}

	public boolean isVenomous()
	{
		return isVenomous;
	}

	public void setVenomous(boolean isVenomous)
	{
		this.isVenomous = isVenomous;
	}

	@Override
	public String toString()
	{
		return " a snake.  It was " + length + " long.  It is " + isVenomous + " that it is venomous.  It is from the group " + species + ".  It was " + color
				+ ". It is " + isAMammal + " that it is a mammal.  It was " + age + " years old.  It was a  " + gender + " and it's name was " + animalsName
				+ ".";
	}
	
	
}
