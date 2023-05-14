package org.tools;

public class Automation extends MultipleLanguage implements TestTool,Language {
	
	public void java() {
		System.out.println("Java Tool");
		
	}

	public void selenium() {
		System.out.println("Selenium Tool");
		
	}
	
	
	public void python() {
		System.out.println("Python Language");
	}
	
	public void ruby() {
		System.out.println("Ruby Language");

	}
	
	public static void main(String[] args) {
		
		Automation at = new Automation();
		
		at.java();
		at.selenium();
		at.python();
		at.ruby();
	}
	
	

}
