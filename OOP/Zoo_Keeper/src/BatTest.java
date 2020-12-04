
public class BatTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bat bat = new Bat();

		bat.fly();
		bat.attackTown();
		bat.fly();
		bat.eatHumans();
		bat.attackTown();
		bat.attackTown();
		System.out.println("The giant bat is now tired, energy level at " + bat.displayEnergy());
	}

}
