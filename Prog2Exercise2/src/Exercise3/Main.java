package Exercise3;

public class Main {

	public static void main(String[] args) {
		Cat british = new Cat();
		Cat sphnyx = new Cat("Sphnyx Cat", "Skin colour", "Medium", 'N', 14, 5800);
		Cat ragdoll = new Cat("Ragdoll", "White", "Large", 'Y', 15, 1650);
		
		System.out.println(" ****** BRITISH SHORTHAIR ****** ");
		System.out.println("Breed: " +british.breed);
		System.out.println("Colour: " +british.colour);
		System.out.println("Size: " +british.size);
		System.out.println("Coat: " +british.coat);
		System.out.println("Lifepan: " +british.lifespan+ " years. ");
		System.out.println("Current price: RM" +british.price);
		System.out.println();
														
		System.out.println(" ****** SPHHNYX CAT ****** ");
		System.out.println("Breed: " +sphnyx.breed);
		System.out.println("Colour: " +sphnyx.colour);
		System.out.println("Size: " +sphnyx.size);
		System.out.println("Coat: " +sphnyx.coat);
		System.out.println("Lifepan: " +sphnyx.lifespan+ " years. ");
		System.out.println("Current price: RM" +sphnyx.price);
		System.out.println();
		
		System.out.println(" ****** RAGDOLL ******");
		System.out.println("Breed: " +ragdoll.breed);
		System.out.println("Colour: " +ragdoll.colour);
		System.out.println("Size: " +ragdoll.size);
		System.out.println("Coat: " +ragdoll.coat);
		System.out.println("Lifepan: " +ragdoll.lifespan+ " years. ");
		System.out.println("Current price: RM" +ragdoll.price);
		System.out.println();
	}

}
