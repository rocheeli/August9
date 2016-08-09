package com.tuesdayassignment.zooexplorer;

public class Penguin extends Animal
{
	protected boolean canSwim = true;
	protected float height = 0.0f;
	
	
	public Penguin(String species, String color, boolean isAMammal, int age, String gender, String animalsName,
			boolean canSwim, float height)
	{
		super(species, color, isAMammal, age, gender, animalsName);
		this.canSwim = canSwim;
		this.height = height;
	}


	public boolean isCanSwim()
	{
		return canSwim;
	}


	public void setCanSwim(boolean canSwim)
	{
		this.canSwim = canSwim;
	}


	public float getHeight()
	{
		return height;
	}


	public void setHeight(float height)
	{
		this.height = height;
	}


	@Override
	public String toString()
	{
		return " a penguin.  It is " + canSwim + " that it can swim.  It is " + height + " in height.  It is from the group "  + species + ".  This penguin was " + color
				+ ".  It is " + isAMammal + " that it is a mammal.  It was " + age + " years old.  It was a " + gender + ", and it's name was " + animalsName
				+ ".";
	}
	
	
	
}
