package com.tuesdayassignment.zooexplorer;

public class Hamster extends Animal
{
	protected boolean isNocturnal = false;
	protected boolean hasTail = false;
	public Hamster(String species, String color, boolean isAMammal, int age, String gender, String animalsName,
			boolean isNocturnal, boolean hasTail)
	{
		super(species, color, isAMammal, age, gender, animalsName);
		this.isNocturnal = isNocturnal;
		this.hasTail = hasTail;
	}
	public boolean isNocturnal()
	{
		return isNocturnal;
	}
	public void setNocturnal(boolean isNocturnal)
	{
		this.isNocturnal = isNocturnal;
	}
	public boolean isHasTail()
	{
		return hasTail;
	}
	public void setHasTail(boolean hasTail)
	{
		this.hasTail = hasTail;
	}
	@Override
	public String toString()
	{
		return " a hamster.  It is " + isNocturnal + " that it is nocturnal.  It is " + hasTail + " that it has a tail.  It is from the group " + species + ".  It was "
				+ color + ".  It is " + isAMammal + " that it is a mammal.  It was " + age + " years old. It was a " + gender + " and it's name was "
				+ animalsName + ".";
	}
	
	
	
}
