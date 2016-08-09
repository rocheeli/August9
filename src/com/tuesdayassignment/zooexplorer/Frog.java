package com.tuesdayassignment.zooexplorer;

public class Frog extends Animal
{
		protected boolean isVenomous = false;
		protected float jumpDistance = 0.0f;
		
		
		public Frog(String species, String color, boolean isAMammal, int age, String gender, String animalsName,
				boolean isVenomous, float jumpDistance)
		{
			super(species, color, isAMammal, age, gender, animalsName);
			this.isVenomous = isVenomous;
			this.jumpDistance = jumpDistance;
		}


		public boolean isVenomous()
		{
			return isVenomous;
		}


		public void setVenomous(boolean isVenomous)
		{
			this.isVenomous = isVenomous;
		}


		public float getJumpDistance()
		{
			return jumpDistance;
		}


		public void setJumpDistance(float jumpDistance)
		{
			this.jumpDistance = jumpDistance;
		}


		@Override
		public String toString()
		{
			return " a frog.  It is  " + isVenomous + " that it is venomous.  It can jump " + jumpDistance + ". It is from the group " + species
					+ ".  It was " + color + ".  It is  " + isAMammal + " that it is a mammal.  It was " + age + " years old.  It was a " + gender
					+ " and it's name was " + animalsName + ".";
		}
	
		
		
		
		
}
