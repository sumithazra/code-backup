import java.io.IOException;

class Class1 {
	    public static int Method1(){
	          return 0;
	    }
	}
public class StaticMethodOverriding extends Class1{

	/* public static int Method1(){
         return 1;
   }
	*/
	
	public void display()
	{
		System.out.println("display");
		
	}
	
	
	public int display(int i)
	{
		
		return 0;
	}
	
	
	
	  public static void main(int a) {  
		  System.out.println(a);  
		  }  
		    
	  public static void main(String args[]){  
		  System.out.println("main() method invoked");  
		  main(10);  
		  }  
		}  
	
	/*public static void main(String[] args) {
		
		StaticMethodOverriding smo=new StaticMethodOverriding();
		
		System.out.println(smo.Method1());
	}*/
	
	/*static class Class2 extends Class1 {
	    public static int Method1(){
	          return 1;
	    }

	}*/
	/*public static class Main {
	    public static void main(String[] args){
	          //Must explicitly chose Method1 from Class1 or Class2
	          Class1.Method1();
	          Class2.Method1();
	    }*/


