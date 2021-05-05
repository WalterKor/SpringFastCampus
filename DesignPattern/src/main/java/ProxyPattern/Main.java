package ProxyPattern;

import java.util.concurrent.atomic.AtomicLong;

import AopPattern.AopBrowser;

public class Main {
	public static void main(String[] args) {
		
		/*
		Browser browser = new Browser("www.naver.com");
		browser.show();
		browser.show();
		browser.show();
		browser.show();
		*/
		/*
		IBrowser browser = (IBrowser)new BrowserProxy("www.naver.com");
		browser.show();
		browser.show();
		browser.show();
		browser.show();
		browser.show();
		*/
		
		AtomicLong start = new AtomicLong();
		AtomicLong end = new AtomicLong();
		
		IBrowser aopBrowser = new AopBrowser("www.naver.com",
				
				()->{
					System.out.println("before");
					start.set(System.currentTimeMillis());
				},
				
				()->{
					long now = System.currentTimeMillis();
					end.set(now - start.get());
				}				
				
			);		
		
		aopBrowser.show();
		System.out.println("loding time : "+end.get());
			
		aopBrowser.show();
		System.out.println("loding time : "+end.get());
		
	}
}
