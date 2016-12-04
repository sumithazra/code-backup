package array;

public class ArrayTest {

	public static void main(String[] args) {
	
		
		int arr[]={2,3,4,5,6,7};
		ArrayTest at=new ArrayTest();
		System.out.println("the actual array");
		for(int q:arr)
		{
			System.out.print(q+" ");
		}
		System.out.println();
		at.swap(arr);
		at.swap1(arr);
		
	}
	void swap(int[] arr)
	{
		int i1=arr[0];
		int i2=arr[arr.length-1];
		
		arr[0]=i2;
		arr[arr.length-1]=i1;
		
		System.out.println("first swap.........");
		for(int q:arr)
		{
			System.out.print(q+" ");
		}
		System.out.println();
		
		//swap1(arr);
	}
	
	void swap1(int arr[])
	{
		arr[0]=0;
		System.out.println("Second Swap...........");
		for(int q:arr)
		{
			System.out.print(q+" ");
		}
		
	}
	
}
