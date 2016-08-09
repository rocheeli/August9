package com.zooadventurer;

public class Lion extends Mammal
{
	private boolean livesInHeard = false;

	public Lion(String gender, String nickName, float weight, boolean isWarmBlooded, boolean livesInHeard)
	{
		super(gender, nickName, weight, isWarmBlooded);
		this.livesInHeard = livesInHeard;
	}

	public boolean isLivesInHeard()
	{
		return livesInHeard;
	}

	public void setLivesInHeard(boolean livesInHeard)
	{
		this.livesInHeard = livesInHeard;
	}

	@Override
	public String toString()
	{
		return "a lion. It is " + livesInHeard + " that lions live in heards.  It is " + isWarmBlooded() + " that lions are warm blooded.  The lion we saw was a "
				+ getGender() + " and it's nick name was " + getNickName() + ".  It weighed " + getWeight() + " pound.";
	}

	
	
	
}
