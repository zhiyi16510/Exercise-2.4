package ElectronicScanner;

import java.util.Scanner;

public class ElectronicGadget {
	String brand;
	String model;
	char bluetooth;
	char scanner;
	String size;
	char portable;
	char numpad;
	
	Scanner in = new Scanner(System.in);
	
	void query() {
		System.out.println("Welcome, please enter your name and i/c no. to register. >>");
		String name = in.next();
		String ic = in.next();
		System.out.println("I/C no. of " +ic+ " has been successfully registered. ");
		System.out.println("Hi " +name+ ", do check out our latest available promotions! ! ");
	}
	
	void specPrinter(String a,String b, char c, char d, int e) {
		System.out.println("Please enter the brand of the printer you need. >>");
		String prt = in.next();
		System.out.println("The brand you wanted is " +prt);
		System.out.println("Please enter the quantity you need. >>");
		int prt1 = in.nextInt();
		double sum1 = e*prt1;
		if(prt.equalsIgnoreCase("Canon")) {
			System.out.println("Brand    : " +a);
			System.out.println("Model    : " +b);
			System.out.println("Bluetooth: " +c);
			System.out.println("Scanner  : " +d);
			System.out.println("The price for one unit is: " + "RM" +e);
			System.out.println("The total price is: RM" +sum1);
			System.out.println("----------------------------------------------------- \n");
		} else if(prt.equalsIgnoreCase("Brother")) {
			System.out.println("Brand    : " +a);
			System.out.println("Model    : " +b);
			System.out.println("Bluetooth: " +c);
			System.out.println("Scanner  : " +d);
			System.out.println("The price for one unit is: " + "RM" +e);
			System.out.println("The total price is: RM" +sum1);
			System.out.println("----------------------------------------------------- \n");
		} else {
			System.out.println("Sorry, " +prt+ " is not available at the moment. ");
		}
	}
	
	void specAC(String a,String b, String h, char d, int e) {
		System.out.println("Please enter the brand of the air conditioner you need. >>");
		String ac = in.next();
		System.out.println("The brand you wanted is " +ac);
		System.out.println("Please enter the quantity you need. >>");
		int ac1 = in.nextInt();
		double sum1 = e*ac1;
		if(ac.equalsIgnoreCase("Samsung")) {
			System.out.println("Brand    : " +a);
			System.out.println("Model    : " +b);
			System.out.println("Size: " +h);
			System.out.println("Portable : " +d);
			System.out.println("The price for one unit is: " + "RM" +e);
			System.out.println("The total price is: RM" +sum1);
			System.out.println("----------------------------------------------------- \n");
		} else if(ac.equalsIgnoreCase("Midea")) {
			System.out.println("Brand    : " +a);
			System.out.println("Model    : " +b);
			System.out.println("Size: " +h);
			System.out.println("Portable : " +d);
			System.out.println("The price for one unit is: " + "RM" +e);
			System.out.println("The total price is: RM" +sum1);
			System.out.println("----------------------------------------------------- \n");
		} else {
			System.out.println("Sorry, " +ac+ " is not available at the moment. ");
		}
	}
	
	void warrantyClaim() {
		System.out.println(" **** CHECK YOUR PRODUCT'S WARRANTY **** ");
		System.out.println("Please enter the brand of the product. >>");
		String brand = in.next();
		System.out.println("Warranty for " +brand);
		System.out.println("Please enter the number of warranty applied for the product (in year). >>");
		int warr = in.nextInt();
		System.out.println("The warranty is valid for " +warr+ " years.");
		System.out.println("No charges on return goods by 6 days after purchasing the goods. ");
		System.out.println("------------------------------------------------------ \n");
	}
	
	void freeService() {
		System.out.println(" **** FREE SERVICE PROMOTION OFFER **** ");
		System.out.println("Please enter the brand. >>");
		String brand1 = in.next();
		System.out.println("Service offer for " +brand1);
		System.out.println("Please enter the number of bought goods in this purchase order. >>");
		int order = in.nextInt();
		if(order>=10) {
			System.out.println("Free service would be provided for 5 years. ^^");
		} else if(order>=5) {
			System.out.println("Free service would be provided for 1 and a half year. ^^");
		} else {
			double service = (order+2)/5;
			System.out.println("Free service for " +service+ " year(s) would be provided. ^^");
		}
		System.out.println("------------------------------------------------------ \n");
	}
	
	void maintenance() {
		System.out.println("Are you a member of us? Type 'Yes' or 'No'. >>");
		String member = in.next();
		if(member.equalsIgnoreCase("Yes")) {
			System.out.println("Thank you for your support!<3 \nHow long has you been our member? (in months)");
			int duration = in.nextInt();
			double dis = duration*10;
			System.out.println("Maintenance fees will be discounted RM" +dis);
		} else if(member.equalsIgnoreCase("No")) {
			System.out.println("Oops, seems like you're not eligible for any discounts provided. ");
		}
		System.out.println("------------------------------------------------------ \n");
	}
	
	void price(int e) {
		System.out.println(" **** CHECKOUT SECTION **** ");
		System.out.println("Please enter the brand of the product and the quantity of your choice. >>");
		String brand2 = in.next();
		int quantity = in.nextInt();
		System.out.println("You have chosen to buy " +quantity+ " of " +brand2);
		int sum = quantity*e;
		System.out.println("The total price for your order is RM" +sum);
		System.out.println("======================================================");
		System.out.println();
	}
}
