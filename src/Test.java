import java.util.Scanner;


public class Test {
	
	/*Test A;
	Test()
	{
		
		A=new Test();
	}
	*/
	/* public static void main(String[] args) {

		    //Test t=new Test();
	        double d[]={1,2,3,4,5,6,7,8,9,10,11,26,55,89,56,2,45,25,89,62,54,36,45};
	        System.out.println("Number of elements in the array: "+d.length);
	        Scanner sc=new Scanner(System.in);
	        System.out.println("Enter the range :");
	        int range=sc.nextInt();

	        //System.out.println((d.length%range)+ " remaing numbers are not coming into a group "+"\t");

	        int remaingno=d.length%range;
	        double restsum=0;
	        Integer number= Test.getArrayLength(d, range);
	        
	       // System.out.println("Length of Array" +number );
	        
	      if(remaingno!=0)
	      { 
	    	  for (int r = d.length-1 ; r>(d.length-remaingno-1); r--)
	       {
	           restsum=restsum + d[r];
	        }
	      
	      }
	        double arr[]=new double[number];

	        //System.out.println(arr.length+" The length of the new arry");

	       // System.out.println("**************************************************");

	      
	        int p=0;
	        for( int m=0, j=0; j<(d.length-remaingno); ){

	            double average;
	            
	            double total=0.0;

	            for(int l=0;l<range;l++)
	            {
	                 total=total+d[m];
	                 m++;


	            }
	             System.out.println(total+"............total");

	            average=total/range;
	          
	            
	            arr[p]=average;
	            
	            p++;
	            
	            j+=range;
	        }
	      //  System.out.println(restsum+"restsum total");

	       // System.out.println("************************************************************");
	         
	        if(remaingno!=0)
	        	{
	        	
	        	arr[p]=restsum/remaingno;
	        	
	        	}
	        
	         System.out.println("average ...................");

	         for(int k=0; k<arr.length; k++){

	            System.out.println(arr[k]);
	         }

	        //System.out.println("//note::: last average is not divided by
	//range ; its divided by remaining numbers ........Its the exact way to
	//find average.. This is correct procedure ");

	    }




	     public static int getArrayLength(double[]numbers ,int range )
	        {
	            int length=0;

	            if(((numbers.length) % range)!=0)
	            {
	                length= (numbers.length / range) + 1;

	            }
	            else{

	                length= (numbers.length / range);

	            }
	            return length;

	        }
*/
	
/*public static void main(String[] args) {
	String s1="abc";
	String s2="def";
	String s3=s1.concat(s2.toUpperCase());
	System.out.println(s1+s2+s3);
	Object obj=new Object();
	
	
	
	
}*/
	
	private void add(int a)
	{
		
loop :for(int i=1; i<3; i++)
{
	for(int j=1;j<3;j++)
	{
		if(a==5)
		{
			break loop;
			
		}
		System.out.println(i*j);
	}
}
	}
	
	//abstract void display();
	public static void main(String[] args) {
		
		/*Test t=new Test();
		t.add(5);*/
		
		boolean a=false;
		if(a=true)
		{
			
			System.out.println("hello");
		}
		else
		{
			
			System.out.println("goodbye");
		}
		
		TestExpandable ts=new TestExpandable();
		//System.out.println(ts.add(4));
		//ts.add(4);
		
		
		int x=0;
		int y=0;
		
		for (int i = 0; i < 5; i++) {
			
			if(++x>2|| ++y>2)
			{
				
				x++;
			}
			
			
		}
		System.out.println(x+ " "+y);
		
		Scanner sc=new Scanner(System.in);
		int a111=sc.nextInt();
		
		int b111=sc.nextInt();
		
		System.out.println(a111+" "+b111);
		
		 Scanner in = new Scanner(System.in); 
		    while (in.hasNext()) {
		        if (in.hasNextInt())
		            System.out.println(in.nextInt());
		        else 
		            in.next();
		    }
	}
	
	
	
}

class TestExpandable extends Test
{
	/*int add(int a)
	{
		System.out.println("hello");
		return a;
	}*/

}