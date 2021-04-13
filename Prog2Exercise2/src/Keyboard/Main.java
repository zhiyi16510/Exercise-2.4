package Keyboard;

public class Main {

	public static void main(String[] args) {
		Keyboard raspberry = new Keyboard();
		Keyboard logitech = new Keyboard();
		Keyboard razer = new Keyboard();
		Keyboard asus = new Keyboard();
		
		raspberry.setBrand("Raspberry");
		raspberry.setModel("Pi 400");
		raspberry.setNumpad('N');
		raspberry.setBluetooth('Y');
		raspberry.setPrice(329);
		
		System.out.println(" ***** RASPBERRY ***** ");
		System.out.println("Brand: " +raspberry.getBrand());
		System.out.println("Model: " +raspberry.getModel());
		System.out.println("Number pad: " +raspberry.getNumpad());
		System.out.println("Bluetooth: " +raspberry.getBluetooth());
		System.out.println("Price: RM" +raspberry.getPrice());
		System.out.println();
		
		logitech.setBrand("Logitech");
		logitech.setModel("K120");
		logitech.setNumpad('Y');
		logitech.setBluetooth('N');
		logitech.setPrice(135.97);
		
		System.out.println(" ***** LOGITECH ***** ");
		System.out.println("Brand: " +logitech.getBrand());
		System.out.println("Model: " +logitech.getModel());
		System.out.println("Number pad: " +logitech.getNumpad());
		System.out.println("Bluetooth: " +logitech.getBluetooth());
		System.out.println("Price: RM" +logitech.getPrice());
		System.out.println();
		
		razer.setBrand("Razer");
		razer.setModel("Huntsman Elite V Optical");
		razer.setNumpad('Y');
		razer.setBluetooth('N');
		razer.setPrice(871);
		
		System.out.println(" ***** RAZER ***** ");
		System.out.println("Brand: " +razer.getBrand());
		System.out.println("Model: " +razer.getModel());
		System.out.println("Number pad: " +razer.getNumpad());
		System.out.println("Bluetooth: " +razer.getBluetooth());
		System.out.println("Price: RM" +razer.getPrice());
		System.out.println();
		
		asus.setBrand("Asus ROG");
		asus.setModel("Claymore Aura RGB Cherry MX Red");
		asus.setNumpad('Y');
		asus.setBluetooth('N');
		asus.setPrice(674.12);
		
		System.out.println(" ***** ASUS ROG ***** ");
		System.out.println("Brand: " +asus.getBrand());
		System.out.println("Model: " +asus.getModel());
		System.out.println("Number pad: " +asus.getNumpad());
		System.out.println("Bluetooth: " +asus.getBluetooth());
		System.out.println("Price: RM" +asus.getPrice());

	}

}
