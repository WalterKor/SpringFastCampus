package AdapterPattern.Ex2;

public class DuckTestDrive {
	
	public static void main(String[] args) {
		
		MallardDuck duck = new MallardDuck();
		
		WildTurkey turkey = new WildTurkey();
		Duck turkeyAdapter = new TurkeyAdapter(turkey);
		
		System.out.println("터키가 운다.");
		turkey.gobble();
		turkey.fly();
		
		System.out.println("오리가 운다");
		testDuck(duck);
		
		System.out.println("터키 어뎁터 사용");
		testDuck(turkeyAdapter);
		
	}
	
	public static void testDuck(Duck duck) {
		duck.quack();
		duck.fly();
	}
	
	
}
