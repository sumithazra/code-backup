
public class TestArraySpecial {
	 static int k;
	public static void main(String[] args) {
		int arr[] = new int[128];
		arr['a']++;
		//System.out.println(arr);
		/*{
		 String str = "aasbkllzzzs";
		 int freq[] = new int[128];
		for (char ch : str.toCharArray()) {
			System.out.println(ch + " "+new Integer(ch));
			System.out.print(freq[ch]+"---");
            freq[ch]++;
            System.out.print("----" +freq[ch]+"\n");
        }
		 //System.out.println(freq.length);
		 System.out.println("Frequencies : ");
	        for (int i = 0; i < freq.length; i++) {
	        	System.out.println(freq[i]);
	        	
	        }
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
	
		}
	        
		}*/
		int test[] =new int[5];
		for (int i = 0; i < test.length; i++) {
			test[i]++;
		}
		for (int i = 0; i < test.length; i++) {
			System.out.println(i+"th"+" postion in array " + test[i]);
		}
		
		
		System.out.println(k);
	}
}
