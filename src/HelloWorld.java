import java.io.IOException;
import java.util.HashMap;
import java.util.Map.Entry;


public class HelloWorld implements Cloneable{

	public class Node{
		int data;
		public Node(int item)
		{
			data=item;
		}
		public String toString()
		{
			return String.valueOf(data);}
	}
	private void show()
	{System.out.println("Hi");}
	public static void main(String[] args) throws IOException {
		  
		System.out.println("Hello world");
		Long n =new Long("10");
		Short s=new Short("10");
		int[] array= new int[3];
		array[0]=1;
		array[1]=2;
		array[2]=3;
		for(int i=0; i<3; i++)
		{
			System.out.println(array[i]);
		}
		
		System.out.println("outside the for loop");
		if(n.equals(s))
		{
			System.out.println("same object");
			
		}
		
		System.out.println("hdfj");
		System.err.println("error message");  
		
		
		HelloWorld hw=new HelloWorld();
		Class c1=hw.getClass();
		System.out.println("Class name :::: "+ c1.getClass()+":   "+HelloWorld.class);
		System.out.println();
		
		hw.show();
		try {
			HelloWorld hw1=(HelloWorld)hw.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		/*Thread t1=new Thread();
		t1.start();*/

		
		/*HashMap<Integer,String> hs =new HashMap<Integer,String>();
		hs.put(1, "One");
		hs.put(1, "One");
		
		  for(Entry<Integer, String> m:hs.entrySet()){  
			   System.out.println(m.getKey()+" "+m.getValue());  
		  }*/
		
		
		
		Node[] ar=new Node[3];
		Node n1=hw.new Node(10);
		Node n2=hw.new Node(20);
		Node n3=hw.new Node(30);
		Node n4=hw.new Node(40);
		
		ar[0]=n1;
		ar[1]=n2;
		ar[2]=n3;
		n1=null;
		for(int  i=0; i<ar.length; i++)
		{
			System.out.println(ar[i]);
		}
		System.out.println(n1);
	}

}
