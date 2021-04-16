package Exercise3;

import java.util.Scanner;

public class Cat {
	Scanner in = new Scanner(System.in);
	
	String breed, colour, size;
	char coat;
	int price, lifespan;
	
	//default constructor
	Cat(){
		System.out.println("Enter the breed name of the cat: ");
		this.breed = in.next();
		System.out.println("Enter the brief colour of the cat: ");
		this.colour = in.next();
		System.out.println("Enter the size of the cat (small, medium or large): ");
		this.size = in.next();
		System.out.println("Does this breed has coat fur? Enter 'Y' for YES or 'N' for NO: ");
		this.coat = in.next().charAt(0);
		System.out.println("What is the lifespan of the cat in years: ");
		this.lifespan = in.nextInt();
		System.out.println("What is the current price of this cat in RM: ");
		this.price = in.nextInt();
	}
	
	//parameterized constructor
	Cat(String breed, String colour, String size, char coat, int lifespan, int price){
		this.breed = breed;
		this.colour = colour;
		this.size = size;
		this.coat = coat;
		this.lifespan = lifespan;
		this.price = price;
	}
}
