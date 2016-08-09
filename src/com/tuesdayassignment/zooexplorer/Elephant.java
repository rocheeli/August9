package com.tuesdayassignment.zooexplorer;

public class Elephant extends Animal
{
	protected boolean hasTusks = false;
	protected float trunkLength = 0.0f;
	
	public Elephant(String species, String color, boolean isAMammal, int age, String gender, String animalsName,
			boolean hasTusks, float trunkLength)
	{
		super(species, color, isAMammal, age, gender, animalsName);
		this.hasTusks = hasTusks;
		this.trunkLength = trunkLength;
	}

	public boolean isHasTusks()
	{
		return hasTusks;
	}

	public void setHasTusks(boolean hasTusks)
	{
		this.hasTusks = hasTusks;
	}

	public float getTrunkLength()
	{
		return trunkLength;
	}

	public void setTrunkLength(float trunkLength)
	{
		this.trunkLength = trunkLength;
	}

	@Override
	public String toString()
	{
		return " an elephant.  It is " + hasTusks + " that it has tusks.  It's trunk was " + trunkLength + " long.  It is from the group " + species + ".  It was "
				+ color + ".  It is " + isAMammal + " that it is a mammal.  It was " + age + " years old.  It was a " + gender + " and it's name was "
				+ animalsName + ".";
	}

	
	
	
	
	
}
