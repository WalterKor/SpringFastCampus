package AdapterPattern.Ex1;

import com.mysql.cj.exceptions.UnableToConnectException;

public class TicketAdapter implements TicketG {

	private TicketA ticket;
	
	 public TicketAdapter(TicketA ticket) {
		 super();
		 this.ticket = ticket;
	}
	
	@Override
	public void choice(int token) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void buyOnOffLine() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void buyOnOnLine() {
		throw new UnableToConnectException("지원되지 않는 기능");
		
	}

	@Override
	public String getMenu() {
		throw new UnableToConnectException("지원되지 않는 기능");
	}

	
}
