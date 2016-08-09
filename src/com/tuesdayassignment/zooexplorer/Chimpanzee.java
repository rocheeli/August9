package com.tuesdayassignment.zooexplorer;

public class Chimpanzee extends Animal
{
	
	protected boolean livesAlone = false;
	protected boolean hasOpposibleThumbs = true;
	

	public Chimpanzee(String species, String color, boolean isAMammal, int age, String gender, String animalsName,
			boolean livesAlone, boolean hasOpposibleThumbs)
	{
		super(species, color, isAMammal, age, gender, animalsName);
		this.livesAlone = livesAlone;
		this.hasOpposibleThumbs = hasOpposibleThumbs;
	}

	public boolean isLivesAlone()
	{
		return livesAlone;
	}

	public void setLivesAlone(boolean livesAlone)
	{
		this.livesAlone = livesAlone;
	}

	public boolean isHasOpposibleThumbs()
	{
		return hasOpposibleThumbs;
	}

	public void setHasOpposibleThumbs(boolean hasOpposibleThumbs)
	{
		this.hasOpposibleThumbs = hasOpposibleThumbs;
	}

	@Override
	public String toString()
	{
		return " a chimpanzee. It is " + livesAlone + " that it lives alone.  It is " + hasOpposibleThumbs + " that it has opposible thumbs. It is from the group "
				+ species + ".  This chimpanzee was the color " + color + ".  It is " + isAMammal + " that it is a mammal.   It was " + age +" years old. It was a " + gender
				+ " and it's name was " + animalsName + "." ;
	}
	
	
}

