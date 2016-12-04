
 interface Strange{
	
	void display();
	
}

public class InterfaceTest {

	
	public static void main(String[] args) {
		
		Strange st=new Strange()
		{
			public void display()
			{
				System.out.println("I am learning");
			}
						
		};
		
	System.out.println(st.getClass());		
	}
}
