package OOPexercise;

public class AirCond {
	String brand = "Samsung";
	String model = "1.5HP S-Essential AR12TGHQABUNME";
	String portable = "No";
	int timer;
	
	void coolMode() {
		System.out.println("You've entered cool mode.");
	}
	
	void fanMode() {
		System.out.println("You've entered fan mode.");
	}
	
	void timer() {
		timer = 10;
		System.out.println("The timer has been set to " + timer + " minutes.");
	}
	
	void silentFan() {
		System.out.println("Silent fan mode has been turned on.");
	}
}
