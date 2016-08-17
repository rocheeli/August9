package com.zooepic;

public class HowlerMonkey extends Primate
{
	private boolean buildsNest = true;
	private int soundDecibel = 0;
	
	public HowlerMonkey(String noiseItMakes, String gender, int numberOfOffspringAtATime, boolean hasFurOrHair,
			String habitat, boolean hasTail, boolean buildsNest, int soundDecibel)
	{
		super(noiseItMakes, gender, numberOfOffspringAtATime, hasFurOrHair, habitat, hasTail);
		this.buildsNest = buildsNest;
		this.soundDecibel = soundDecibel;
	}
	public HowlerMonkey()
	{
	}
	public boolean isBuildsNest()
	{
		return buildsNest;
	}
	public void setBuildsNest(boolean buildsNest)
	{
		this.buildsNest = buildsNest;
	}
	public int getSoundDecibel()
	{
		return soundDecibel;
	}
	public void setSoundDecibel(int soundDecibel)
	{
		this.soundDecibel = soundDecibel;
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
		return "HowlerMonkey [buildsNest=" + buildsNest + ", soundDecibel=" + soundDecibel + ", noiseItMakes="
				+ noiseItMakes + ", gender=" + gender + ", getHabitat()=" + getHabitat() + ", isHasTail()="
				+ isHasTail() + ", getNumberOfOffspringAtATime()=" + getNumberOfOffspringAtATime()
				+ ", isHasFurOrHair()=" + isHasFurOrHair() + "]";
	}
	
	
}
