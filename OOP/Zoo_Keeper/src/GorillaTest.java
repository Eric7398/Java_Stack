
public class GorillaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gorilla gorilla = new Gorilla();
		gorilla.throwSomething();
		gorilla.eatBanana();
		gorilla.climb();
		gorilla.eatBanana();
		gorilla.climb();
		gorilla.throwSomething();
		System.out.println("It's night time, the Gorilla is gonna sleep with " + gorilla.displayEnergy() + " energy left.");
	}

}
