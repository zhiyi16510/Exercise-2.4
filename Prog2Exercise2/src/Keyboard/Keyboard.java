package Keyboard;

public class Keyboard {
	String brand;
	String model;
	char numpad;
	char bluetooth;
	double price;
	
	//create setter method
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public void setNumpad(char numpad) {
		this.numpad = numpad;
	}
	
	public void setBluetooth(char bluetooth) {
		this.bluetooth = bluetooth;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	
	//create getter method
	public String getBrand() {
		return this.brand;
	}
	
	public String getModel() {
		return this.model;
	}
	
	public char getNumpad() {
		return this.numpad;
	}
	
	public char  getBluetooth() {
		return this.bluetooth;
	}
	
	public double getPrice() {
		return this.price;
	}
}
