package com.tuesdayassignment.zooexplorer;

public class Giraffe extends Animal
{
	protected float neckLength = 0.0f;
	protected String tongueColor = null;
	
	
	public Giraffe(String species, String color, boolean isAMammal, int age, String gender, String animalsName,
			float neckLength, String tongueColor)
	{
		super(species, color, isAMammal, age, gender, animalsName);
		this.neckLength = neckLength;
		this.tongueColor = tongueColor;
	}


	public float getNeckLength()
	{
		return neckLength;
	}


	public void setNeckLength(float neckLength)
	{
		this.neckLength = neckLength;
	}


	public String getTongueColor()
	{
		return tongueColor;
	}


	public void setTongueColor(String tongueColor)
	{
		this.tongueColor = tongueColor;
	}


	@Override
	public String toString()
	{
		return " a giraffe.  It's neck was " + neckLength + " long.  It's tongue was " + tongueColor + ".  It is from the group " + species
				+ ".  It was " + color + ".  It is " + isAMammal + " that it is a mammal.  It was " + age + " years old.  It was a " + gender
				+ " and it's name was " + animalsName + ".";
	}
	
	
	
	
	
	
	
	
}
