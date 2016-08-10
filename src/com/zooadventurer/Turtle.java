package com.zooadventurer;

public class Turtle extends Reptile
{
	private int shellCircumference = 0;

	public Turtle(String gender, String nickName, float weight, String habitat, int shellCircumference)
	{
		super(gender, nickName, weight, habitat);
		this.shellCircumference = shellCircumference;
	}

	public int getShellCircumference()
	{
		return shellCircumference;
	}

	public void setShellCircumference(int shellCircumference)
	{
		this.shellCircumference = shellCircumference;
	}

	@Override
	public String toString()
	{
		return " a turtle.  It's shell circumference was " + shellCircumference + ".  It lives in the " + getHabitat() + ".  It was a "
				+ getGender() + ".  It's nick name was " + getNickName() + ".  It's weight was " + getWeight() + ".";
	}
	
	
	
	
}
