package com.zooepic;

public class Bobcat extends Feline
{
	private boolean eatsRabbits = true;
	private boolean marksTerritory = true;
	
	public Bobcat(String noiseItMakes, String gender, int numberOfOffspringAtATime, boolean hasFurOrHair,
			boolean hasRetractableClaws, boolean isAPackAnimal, boolean eatsRabbits, boolean marksTerritory)
	{
		super(noiseItMakes, gender, numberOfOffspringAtATime, hasFurOrHair, hasRetractableClaws, isAPackAnimal);
		this.eatsRabbits = eatsRabbits;
		this.marksTerritory = marksTerritory;
	}

	public Bobcat()
	{
	}

	public boolean isEatsRabbits()
	{
		return eatsRabbits;
	}

	public void setEatsRabbits(boolean eatsRabbits)
	{
		this.eatsRabbits = eatsRabbits;
	}

	public boolean isMarksTerritory()
	{
		return marksTerritory;
	}

	public void setMarksTerritory(boolean marksTerritory)
	{
		this.marksTerritory = marksTerritory;
	}
	
	@Override
	public void moves()
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void breathes()
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void eats()
	{
		// TODO Auto-generated method stub

	}

	@Override
	public String toString()
	{
		return "Bobcat [eatsRabbits=" + eatsRabbits + ", marksTerritory=" + marksTerritory + ", noiseItMakes="
				+ noiseItMakes + ", gender=" + gender + ", isHasRetractableClaws()=" + isHasRetractableClaws()
				+ ", isAPackAnimal()=" + isAPackAnimal() + ", getNumberOfOffspringAtATime()="
				+ getNumberOfOffspringAtATime() + ", isHasFurOrHair()=" + isHasFurOrHair() + "]";
	}
	
	
	
	
}
