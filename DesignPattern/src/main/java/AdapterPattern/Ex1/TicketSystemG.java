package AdapterPattern.Ex1;

public class TicketSystemG implements TicketG{

	@Override
	public void choice(int token) {
	
		System.out.println("선택된 식권 타입은" + token + "입니다.");
	}

	@Override
	public void print() {
		System.out.println("식권을 출렵합니다.");
		
	}

	@Override
	public void buyOnOffLine() {
		System.out.println("오프라인으로 구매합니다.");
		
	}

	@Override
	public void buyOnOnLine() {
		System.out.println("온라인으로 구매합니다.");
		
	}

	@Override
	public String getMenu() {
		
		return "메뉴정보를 DB에서 가져왔습니다.";
	}

}
