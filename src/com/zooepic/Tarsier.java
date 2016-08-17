package com.zooepic;

public class Tarsier extends Primate
{
	
	private int eyeballDiameter = 0;
	private boolean brainIsSizeOfEyeball = true;
	
	public Tarsier(String noiseItMakes, String gender, int numberOfOffspringAtATime, boolean hasFurOrHair,
			String habitat, boolean hasTail, int eyeballDiameter, boolean brainIsSizeOfEyeball)
	{
		super(noiseItMakes, gender, numberOfOffspringAtATime, hasFurOrHair, habitat, hasTail);
		this.eyeballDiameter = eyeballDiameter;
		this.brainIsSizeOfEyeball = brainIsSizeOfEyeball;
	}

	public Tarsier()
	{
	}

	public int getEyeballDiameter()
	{
		return eyeballDiameter;
	}

	public void setEyeballDiameter(int eyeballDiameter)
	{
		this.eyeballDiameter = eyeballDiameter;
	}

	public boolean isBrainIsSizeOfEyeball()
	{
		return brainIsSizeOfEyeball;
	}

	public void setBrainIsSizeOfEyeball(boolean brainIsSizeOfEyeball)
	{
		this.brainIsSizeOfEyeball = brainIsSizeOfEyeball;
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
		return "Tarsier [eyeballDiameter=" + eyeballDiameter + ", brainIsSizeOfEyeball=" + brainIsSizeOfEyeball
				+ ", noiseItMakes=" + noiseItMakes + ", gender=" + gender + ", getHabitat()=" + getHabitat()
				+ ", isHasTail()=" + isHasTail() + ", getNumberOfOffspringAtATime()=" + getNumberOfOffspringAtATime()
				+ ", isHasFurOrHair()=" + isHasFurOrHair() + "]";
	}
	
	
	
	

}
