package com.zooadventurer;

public class Salamander extends Amphibian
{
	private int tailLenth = 0;

	public Salamander(String gender, String nickName, float weight, boolean goesThroughMetamorphosis, int tailLenth)
	{
		super(gender, nickName, weight, goesThroughMetamorphosis);
		this.tailLenth = tailLenth;
	}

	public int getTailLenth()
	{
		return tailLenth;
	}

	public void setTailLenth(int tailLenth)
	{
		this.tailLenth = tailLenth;
	}

	@Override
	public String toString()
	{
		return " a salamander. It's tail was " + tailLenth + " inches long.  It is " + isGoesThroughMetamorphosis()
				+ " that it goes through metamorphosis.  It was a " + getGender() + ".  It's nick name was  " + getNickName() + ".  It's weight was " + getWeight()
				+ ".";
	}

	
	
	
	



}
