package ElectricGadget;

public class Main {

	public static void main(String[] args) {
		Electronic canon = new Electronic();
		Electronic brother = new Electronic();
		Electronic samsung = new Electronic();
		Electronic midea = new Electronic();
		Electronic all = new Electronic();
		
		System.out.println("SPECIFICATIONS FOR PRINTER MODELS");
		canon.specPrinter("Canon", "G3010", 'N', 'Y', 480);
		brother.specPrinter("Brother", "PTP900W", 'N', 'N', 238);
		
		System.out.println(" **** WARRANTY CLAIM ON PRINTER ****");
		canon.warrantyClaim("Canon", 2, 30);
		brother.warrantyClaim("Brother", 1, 60);
		
		System.out.println(" !!!! FREE SERVICE OFFER !!!! ");
		canon.freeService("Canon", 1, 3);
		brother.freeService("Brother", 2, 5);
		all.maintenance(10, 3);
		
		System.out.println(" $$$$ TOTAL AMOUNT $$$$");
		canon.price("Canon", 3, 480);
		
		System.out.println("SPECIFICATIONS FOR AIR CONDITIONER MODELS");
		samsung.specAC("Samsung", "1.5HP S-Essential AR12TGHAQBUNME", "870 x 270 x 365", 'N', 1450);
		midea.specAC("Midea", "AAC12AR", "736 x 330 x 380", 'Y', 841);
		
		System.out.println(" **** WARRANTY CLAIM ON AIR CONDITIONER ****");
		samsung.warrantyClaim("Samsung", 2, 30);
		midea.warrantyClaim("Midea", 1, 30);
		
		System.out.println(" !!!! FREE SERVICE OFFER !!!! ");
		samsung.freeService("Samsung", 2, 4);
		midea.freeService("Midea", 2, 5);
		all.maintenance(10, 3);
		
		System.out.println(" $$$$ TOTAL AMOUNT $$$$");
		midea.price("Midea", 6, 841);
	}

}
