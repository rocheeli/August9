package com.zooadventurer;

public class Angler extends Fish
{
	private boolean lightWasOn = false;

	public Angler(String gender, String nickName, float weight, String typeOfWater, boolean lightWasOn)
	{
		super(gender, nickName, weight, typeOfWater);
		this.lightWasOn = lightWasOn;
	}

	public boolean isLightWasOn()
	{
		return lightWasOn;
	}

	public void setLightWasOn(boolean lightWasOn)
	{
		this.lightWasOn = lightWasOn;
	}

	@Override
	public String toString()
	{
		return " an angler. It is " + lightWasOn + " that it's light was on.  It lives in  " + getTypeOfWater() + " water.  It was a "
				+ getGender() + " and it's nick name was " + getNickName() + ".  It's weight was " + getWeight() + " pounds.";
	}


	
	
	
}
