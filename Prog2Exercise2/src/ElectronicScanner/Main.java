package ElectronicScanner;

import ElectricGadget.Electronic;

public class Main {

	public static void main(String[] args) {
		ElectronicGadget canon = new ElectronicGadget();
		ElectronicGadget brother = new ElectronicGadget();
		ElectronicGadget samsung = new ElectronicGadget();
		ElectronicGadget midea = new ElectronicGadget();
		ElectronicGadget all = new ElectronicGadget();
		
		all.query();
		System.out.println("------- CANON -------");
		canon.specPrinter("Canon", "G3010", 'N', 'Y', 480);
		canon.warrantyClaim();
		canon.freeService();
		canon.maintenance();
		canon.price(480);
		
		System.out.println("------- BROTHER ------");
		brother.specPrinter("Brother", "PTP900W", 'N', 'N', 238);
		brother.warrantyClaim();
		brother.freeService();
		brother.maintenance();
		brother.price(238);
		
		System.out.println("------- SAMSUNG -------");
		samsung.specAC("Samsung", "1.5HP S-Essential AR12TGHAQBUNME", "870 x 270 x 365", 'N', 1450);
		samsung.warrantyClaim();
		samsung.freeService();
		samsung.maintenance();
		samsung.price(1450);
		
		System.out.println("------- MIDEA -------");
		midea.specAC("Midea", "AAC12AR", "736 x 330 x 380", 'Y', 841);
		midea.warrantyClaim();
		midea.freeService();
		midea.maintenance();
		midea.price(841);
		}
	
	}


