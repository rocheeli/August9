package com.zooadventurer;

public class Frog extends Amphibian
{
	private int jumpingDistance = 0;

	public Frog(String gender, String nickName, float weight, boolean goesThroughMetamorphosis, int jumpingDistance)
	{
		super(gender, nickName, weight, goesThroughMetamorphosis);
		this.jumpingDistance = jumpingDistance;
	}

	public int getJumpingDistance()
	{
		return jumpingDistance;
	}

	public void setJumpingDistance(int jumpingDistance)
	{
		this.jumpingDistance = jumpingDistance;
	}

	@Override
	public String toString()
	{
		return " a frog. It can jump " + jumpingDistance + ".  It is "
				+ isGoesThroughMetamorphosis() + " that it goes through metamorphosis.  It is a " + getGender() + ".  It's nick name was " + getNickName()
				+ ", and it's weight was " + getWeight() + ".";
	}
	
	
	
	
	
	
	
	
}
