/*
public class HelloWorld {
	private String name;
	public void setName(String name) {
		this.name = name;
	}    
	public String getName() {
		return name;
	}    
	public String greet() {
		return "Hello " + name;
	}        
	public static void main(String[] args) {
		HelloWorld helloWorld = new HelloWorld();        
		helloWorld.setName("Groovy");        
		System.out.println( helloWorld.greet() );
	}
}
*/

 class HelloWorld {
	 def name    
	 def greet() {
		 "Hello ${name}"
	 }
 }
 def helloWorld = new HelloWorld()
 helloWorld.name = "GroovyBeforeUpperCaseThisFileName"
 println helloWorld.greet()
 