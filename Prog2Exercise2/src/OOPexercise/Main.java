package OOPexercise;

public class Main {

	public static void main(String[] args) {
		Printer a = new Printer();
		System.out.println(a.brand);
		System.out.println(a.model);
		System.out.println(a.scanner);
		a.network();
		a.directPhone();
		a.colour();
		a.black();
		System.out.println();
		
		AirCond b = new AirCond();
		System.out.println(b.brand);
		System.out.println(b.model);
		System.out.println(b.portable);
		b.fanMode();
		b.coolMode();
		b.timer();
		b.silentFan();

	}

}
