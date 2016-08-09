package com.zooadventurer;

public class Penguin extends Bird
{
	private boolean itFlys = false;

	public Penguin(String gender, String nickName, float weight, float wingSpan, boolean itFlys)
	{
		super(gender, nickName, weight, wingSpan);
		this.itFlys = itFlys;
	}

	public boolean isItFlys()
	{
		return itFlys;
	}

	public void setItFlys(boolean itFlys)
	{
		this.itFlys = itFlys;
	}

	@Override
	public String toString()
	{
		return " a penguin.  It is " + itFlys + " that it can fly.  It's wing span is " + getWingSpan() + ".  It was a  " + getGender()
				+ " and it's nick name was " + getNickName() + ".  It's weight was " + getWeight() + " pounds.";
	}
	
	
	
}
