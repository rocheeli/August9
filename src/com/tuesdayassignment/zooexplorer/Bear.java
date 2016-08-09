package com.tuesdayassignment.zooexplorer;

public class Bear extends Animal
{
	protected boolean eatsFish = false;
	protected boolean hibernates = false;
	
	public Bear(String species, String color, boolean isAMammal, int age, String gender, String animalsName,
			boolean eatsFish, boolean hibernates)
	{
		super(species, color, isAMammal, age, gender, animalsName);
		this.eatsFish = eatsFish;
		this.hibernates = hibernates;
	}

	public boolean isEatsFish()
	{
		return eatsFish;
	}

	public void setEatsFish(boolean eatsFish)
	{
		this.eatsFish = eatsFish;
	}

	public boolean isHibernates()
	{
		return hibernates;
	}

	public void setHibernates(boolean hibernates)
	{
		this.hibernates = hibernates;
	}

	@Override
	public String toString()
	{
		return " a bear.  It is " + eatsFish + " that it eats fish. It is " + hibernates + " that it hibernates.  It is from the group " + species + ".  It was " + color
				+ ". It is " + isAMammal + " that it is a mammal.  It was " + age + " years old.  It was a " + gender + " and it's name was " + animalsName
				+ ".";
	}
	
	

	
	}
	
	
	
	

