package AdapterPattern.Ex1;

public interface TicketG {
	
	public void choice(int token);
	public void print();
	public void buyOnOffLine();//오프라인으로 구매
	public void buyOnOnLine();//온라인으로 구매
	public String getMenu();//메뉴를 들고온다!
	
}
