package week3.day2;

public class Automation extends MultipleLangauge implements Language,TestTool{
	
	public static void main(String[] args) {
		
	 
		Automation obj= new Automation();
		obj.java();
		obj.Selenium();
		obj.python();
		obj.ruby();
		
	}

	public void Selenium() {
		
		
		
	}

	public void java() {
		
		System.out.println("Learn Java");
	}

	@Override
	public void ruby() {
		
		System.out.println("Learn Ruby");
	}

}
