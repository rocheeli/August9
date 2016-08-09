package com.tuesdayassignment.zooexplorer;

import java.util.ArrayList;


public class Zoo
{

	public static void main(String[] args)
	{
		
		ArrayList<Animal> zooblyZoo = new ArrayList <>(10);
		
		
		Chimpanzee chimapanzeeA = new Chimpanzee("Ape", "brown", true, 5, "male", "Bubbles", false, true);
		Penguin penguinA = new Penguin("Bird", "black and white", false, 2, "male", "Chilly Willy", true, 45.5f);
		Lion lionA = new Lion("Feline", "tan", true, 10, "female", "Sheeba", 256.7f, false);
		Bear bearA = new Bear("Ursidae", "black", true, 4, "male", "Yogi", true, true);
		Snake snakeA = new Snake("Reptile", "green", false, 17, "female", "Vishnu", 345.95f, false);
		Hamster hamsterA = new Hamster("Rodent", "tan", true, 1, "male", "Chubby", true, false);
		Frog frogA = new Frog("Amphibian", "blue", false, 2, "female", "Slick", true, 15.9f);
		Elephant elephantA = new Elephant("Pachyderm", "grey", true, 25, "male", "Stampy", true, 78.35f);
		Giraffe giraffeA = new Giraffe("Ungulate", "tan and brown", true, 13, "male", "Stretch", 83.51f, "black");
		Otter otterA = new Otter("Lutrinae", "brown", true, 11, "female", "Pearl", true, true);
		
		zooblyZoo.add(otterA);
		zooblyZoo.add(giraffeA);
		zooblyZoo.add(elephantA);
		zooblyZoo.add(hamsterA);
		zooblyZoo.add(snakeA);
		zooblyZoo.add(bearA);
		zooblyZoo.add(penguinA);
		zooblyZoo.add(chimapanzeeA);
		zooblyZoo.add(frogA);
		zooblyZoo.add(lionA);
		
		System.out.println("Today at the Zoo we saw " + zooblyZoo.get(0));
		System.out.println();
		System.out.println("Today at the Zoo we saw " + zooblyZoo.get(1));
		System.out.println();
		System.out.println("Today at the Zoo we saw " + zooblyZoo.get(2));
		System.out.println();
		System.out.println("Today at the Zoo we saw " + zooblyZoo.get(3));
		System.out.println();
		System.out.println("Today at the Zoo we saw " + zooblyZoo.get(4));
		System.out.println();
		System.out.println("Today at the Zoo we saw " + zooblyZoo.get(5));
		System.out.println();
		System.out.println("Today at the Zoo we saw " + zooblyZoo.get(6));
		System.out.println();
		System.out.println("Today at the Zoo we saw " + zooblyZoo.get(7));
		System.out.println();
		System.out.println("Today at the Zoo we saw " + zooblyZoo.get(8));
		System.out.println();
		System.out.println("Today at the Zoo we saw " + zooblyZoo.get(9));
		
		
	}

}
