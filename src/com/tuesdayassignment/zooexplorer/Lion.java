package com.tuesdayassignment.zooexplorer;

public class Lion extends Animal
{
	protected float weight = 0.0f;
	protected boolean isAlpha = false;
	public Lion(String species, String color, boolean isAMammal, int age, String gender, String animalsName,
			float weight, boolean isAlpha)
	{
		super(species, color, isAMammal, age, gender, animalsName);
		this.weight = weight;
		this.isAlpha = isAlpha;
	}
	public float getWeight()
	{
		return weight;
	}
	public void setWeight(float weight)
	{
		this.weight = weight;
	}
	public boolean isAlpha()
	{
		return isAlpha;
	}
	public void setAlpha(boolean isAlpha)
	{
		this.isAlpha = isAlpha;
	}
	@Override
	public String toString()
	{
		return "a lion. It weighed "  + weight + ". It is "+ isAlpha + " that is is an alpha.  It is from the group " + species + ".  It was " + color
				+ ".  It is " + isAMammal + " that it is a mammal. It was " + age + " years old. It was a " + gender + " and it's name was " + animalsName
				+ ".";
	}
	
	
	
	
	
}
