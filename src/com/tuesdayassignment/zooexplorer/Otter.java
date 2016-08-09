package com.tuesdayassignment.zooexplorer;

public class Otter extends Animal
{
	protected boolean hasTail = false;
	protected boolean canFloat = false;
	public Otter(String species, String color, boolean isAMammal, int age, String gender, String animalsName,
			boolean hasTail, boolean canFloat)
	{
		super(species, color, isAMammal, age, gender, animalsName);
		this.hasTail = hasTail;
		this.canFloat = canFloat;
	}
	public boolean isHasTail()
	{
		return hasTail;
	}
	public void setHasTail(boolean hasTail)
	{
		this.hasTail = hasTail;
	}
	public boolean isCanFloat()
	{
		return canFloat;
	}
	public void setCanFloat(boolean canFloat)
	{
		this.canFloat = canFloat;
	}
	@Override
	public String toString()
	{
		return " an otter.  It is  " + hasTail + " that it has a tail.  It is " + canFloat + " that it can float.  It is from the group " + species + ".  It was " + color
				+ ". It is  " + isAMammal + " that it is a mammal.  It was " + age + " years old.  It was a " + gender + " and it's name was " + animalsName
				+ ".";
	}
	
	
	
	
}
