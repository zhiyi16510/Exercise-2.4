package ElectricGadget;

public class Electronic {
	String brand;
	String model;
	char bluetooth;
	char scanner;
	String size;
	char portable;
	char numpad;
	
	void specPrinter(String a,String b, char c, char d, int e) {
		System.out.println("Brand    : " +a);
		System.out.println("Model    : " +b);
		System.out.println("Bluetooth: " +c);
		System.out.println("Scanner  : " +d);
		System.out.println("The price for one unit is: " + "RM" +e);
		System.out.println("-----------------------------------------------------");
	}
	
	void specAC(String f, String g, String h, char i, int j) {
		System.out.println("Brand   : " +f);
		System.out.println("Model   : " +g);
		System.out.println("Size    : " +h);
		System.out.println("Portable: " +i);
		System.out.println("The price for one unit is: " + "RM" +j);
		System.out.println("------------------------------------------------------");
	}
	
	void warrantyClaim(String p,int k, int l) {
		System.out.println("Warranty for: " +p);
		System.out.println("The warranty is valid for " + k + " years.");
		System.out.println("No charges on return goods by " + l + " days after purchasing the goods. ");
		System.out.println("------------------------------------------------------");
	}
	
	void freeService(String p, int n, int o) {
		System.out.println("Service offer for: " +p);
		System.out.println("Free maintenance service for " + o + " year would be provided for customers who buy goods up to " + n + " unit per item. ");
		System.out.println("------------------------------------------------------");
	}
	
	void maintenance(int n, int s) {
		System.out.println("Maintenance fees will be discounted  " + n + "% if you're our member for " + s + " months. "  );
		System.out.println("------------------------------------------------------");
	}
	
	void price(String p, int f, int e) {
		System.out.println("The total price on " + p + " for " + f + " units would be RM" +f*e);
		System.out.println("======================================================");
		System.out.println();
	}
	}