package ProxyPatternEx1;

public class Main {
	
	public static void main(String[] args) {
	
		  MailSender mailSender = new ProxyMailSender();
	      mailSender.send("Hello world!");
	}
}
