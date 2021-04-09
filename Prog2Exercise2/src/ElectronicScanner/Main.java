package ElectronicScanner;

import ElectricGadget.Electronic;

public class Main {

	public static void main(String[] args) {
		ElectronicGadget canon = new ElectronicGadget();
		
		canon.query();
		canon.specPrinter("Canon", "G3010", 'N', 'Y', 480);
		canon.warrantyClaim();
		canon.freeService();
		canon.maintenance();
		canon.price();
		
		}
	
	}


