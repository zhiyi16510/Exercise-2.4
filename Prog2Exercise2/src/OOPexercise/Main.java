package OOPexercise;

public class Main {

	public static void main(String[] args) {
		Electrical1 Canon = new Electrical1();
		System.out.println("The brand of the printer is " + Canon.brand);
		System.out.println("The model of the printer is " + Canon.model);
		System.out.println(Canon.scanner);
		Canon.network();
		Canon.directPhone();
		Canon.colour();
		Canon.black();
		System.out.println();
		
		Electrical2 Samsung = new Electrical2();
		System.out.println("The brand of the air conditioner is " + Samsung.brand);
		System.out.println("The model of the air conditioner is " + Samsung.model);
		System.out.println(Samsung.portable);
		Samsung.fanMode();
		Samsung.coolMode();
		Samsung.timer();
		Samsung.silentFan();
	}

}
