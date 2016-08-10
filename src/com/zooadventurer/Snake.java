package com.zooadventurer;

public class Snake extends Reptile
{
	private boolean isVenomous = false;

	public Snake(String gender, String nickName, float weight, String habitat, boolean isVenomous)
	{
		super(gender, nickName, weight, habitat);
		this.isVenomous = isVenomous;
	}

	public boolean isVenomous()
	{
		return isVenomous;
	}

	public void setVenomous(boolean isVenomous)
	{
		this.isVenomous = isVenomous;
	}

	@Override
	public String toString()
	{
		return " a snake.  It is  " + isVenomous + " that it is venomous.  It lives in the " + getHabitat() + ".  It was a " + getGender()
				+ ".  It's nick name was " + getNickName() + ".  It's weight was " + getWeight() + ".";
	}
	
	
}
