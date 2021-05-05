package ProxyPatternEx1;

import java.util.Objects;

public class ProxyMailSender implements MailSender {
	
	private MailSender mailSender = null;
	
	public ProxyMailSender() {
	}
	
	@Override
	public void send(String message) {
	
		if(Objects.isNull(message)) {
			mailSender = new RealMailSender();
		}
		System.out.println("proxy before process");
		mailSender.send(message);
		System.out.println("proxy after process");
	}

}
