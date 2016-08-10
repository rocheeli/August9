package com.zooadventurer;

import java.util.ArrayList;

public class AdventureZoo
{

	public static void main(String[] args)
	{
		ArrayList<Animal>adventureZoo = new ArrayList<>(10);
		
		Angler anglerA = new Angler("male", "Blinky", 15, "salt", true);
		Bear bearA = new Bear("male", "BooBoo", 234, true, "cave");
		Flamingo flamingoA = new Flamingo("female", "Pinky", 48, 59, "pink");
		Frog frogA = new Frog("female", "Hoppy", 21, true, 85);
		Koi koiA = new Koi("male", "Gill", 5, "fresh", "orange");
		Lion lionA = new Lion("female", "Claws Magoo", 342, true, true);
		Penguin penguinA = new Penguin("male", "Tux", 74, 94, false);
		Salamander salamanderA = new Salamander("female", "Squiggles", 12, false, 11);
		Snake snakeA = new Snake("female", "Frou Frou", 27, "desert", true);
		Turtle turtleA = new Turtle("male", "Testudo", 18, "stream", 23);
		
		adventureZoo.add(turtleA);
		adventureZoo.add(snakeA);
		adventureZoo.add(salamanderA);
		adventureZoo.add(penguinA);
		adventureZoo.add(bearA);
		adventureZoo.add(anglerA);
		adventureZoo.add(lionA);
		adventureZoo.add(koiA);
		adventureZoo.add(frogA);
		adventureZoo.add(flamingoA);

		System.out.println("Today at the Zoo we saw " + adventureZoo.get(0));
		System.out.println();
		System.out.println("Today at the Zoo we saw " + adventureZoo.get(1));
		System.out.println();
		System.out.println("Today at the Zoo we saw " + adventureZoo.get(2));
		System.out.println();
		System.out.println("Today at the Zoo we saw " + adventureZoo.get(3));
		System.out.println();
		System.out.println("Today at the Zoo we saw " + adventureZoo.get(4));
		System.out.println();
		System.out.println("Today at the Zoo we saw " + adventureZoo.get(5));
		System.out.println();
		System.out.println("Today at the Zoo we saw " + adventureZoo.get(6));
		System.out.println();
		System.out.println("Today at the Zoo we saw " + adventureZoo.get(7));
		System.out.println();
		System.out.println("Today at the Zoo we saw " + adventureZoo.get(8));
		System.out.println();
		System.out.println("Today at the Zoo we saw " + adventureZoo.get(9));
		
		
		
	}

}
