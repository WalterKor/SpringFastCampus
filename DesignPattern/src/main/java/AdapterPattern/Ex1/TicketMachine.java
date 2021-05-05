package AdapterPattern.Ex1;

public class TicketMachine {
	public static void main(String[] args) {
		
		/*
		TicketA ticketA = new TicketSystemA();
		ticketA.choice(1);
		ticketA.buy();
		ticketA.print();
		
		System.out.println("-*--*--*--*--*--*--*--*--*--*--*--*--*--*--*-");
		
		TicketG ticketG = new TicketSystemG();
		ticketG.choice(1);
		ticketG.buyOnOffLine();
		ticketG.buyOnOnLine();
		ticketG.print();
		System.out.println(ticketG.getMenu());
	 */
		
		TicketG ticketG = new TicketAdapter(new TicketSystemA());
		
		ticketG.choice(1);
		ticketG.buyOnOnLine();
		ticketG.print();
		
		try {
			System.out.println(ticketG.getMenu());
		} catch (Exception e) {
			System.out.println("이 서비스는 G사의 다른 시스템에서 제공 되는 기능입니다.");
		}
		
		
	}
}
