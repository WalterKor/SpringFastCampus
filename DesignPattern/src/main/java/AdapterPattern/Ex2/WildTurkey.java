package AdapterPattern.Ex2;

public class WildTurkey implements Turkey{

	@Override
	public void gobble() {
		System.out.println("칠면조가 운다");
		
	}

	@Override
	public void fly() {
		System.out.println("칠면조가 날다.");
		
	}

}
