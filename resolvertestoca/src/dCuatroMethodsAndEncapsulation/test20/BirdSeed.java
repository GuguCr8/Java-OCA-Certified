package dCuatroMethodsAndEncapsulation.test20;

public class BirdSeed {
	private int numberBags;
	boolean call;

	public BirdSeed() { 
		// LINE 1
		//numberBags = 2;
		//BirdSeed(2);
		this(2);
		call = false;
		// LINE 2
		//System.out.println(numberBags);
	}

	public BirdSeed(int numberBags) {
		this.numberBags = numberBags;
	}

	public static void main(String[] args) {
		BirdSeed seed = new BirdSeed();
		System.out.println(seed.numberBags);
	}
}