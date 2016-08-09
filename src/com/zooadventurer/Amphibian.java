package com.zooadventurer;

public class Amphibian extends Animal
{
	private boolean goesThroughMetamorphosis = false;

	public Amphibian(String gender, String nickName, float weight, boolean goesThroughMetamorphosis)
	{
		super(gender, nickName, weight);
		this.goesThroughMetamorphosis = goesThroughMetamorphosis;
	}

	public boolean isGoesThroughMetamorphosis()
	{
		return goesThroughMetamorphosis;
	}

	public void setGoesThroughMetamorphosis(boolean goesThroughMetamorphosis)
	{
		this.goesThroughMetamorphosis = goesThroughMetamorphosis;
	}
	
	
	
	
	
	
}
