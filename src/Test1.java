import java.util.*;



class A1 {
        public int i;
        protected int j;
        
}    
class B2 extends A1 {
        int j;
        void display() {
            super.j = 3;
            super.i=10;
            System.out.println(i + " " + j);
        }
}    
public class Test1 {
    public static void main(String args[])
    {
        B2 obj = new B2();
        obj.i=1;
        obj.j=2;   
        obj.display();    
        
        TreeSet t=new  TreeSet ();
        t.add(1);
        t.add(10);
        t.add(0);
        System.out.println(t);
        
        char a[] = new char[10];
        for (int i = 0; i < 10; ++i) {
                a[i] = '1';
                System.out.print(a[i] + "" );
                i++;
            }
     
        System.out.println("new array program");
        int arr[] = new int[] {0,1,2,4,4,5};
        int n = 4;
        n = arr[arr[n] / 2];
        System.out.println(arr[n] / 2);
        
        int var1 = 5;
        int var2 = 6;
        int var3;
        var3 = ++ var2 * var1 / var2 + var2;
        System.out.print(var3);
        
        StringBuffer s1 = new StringBuffer("Hello");
        StringBuffer s2 = s1.reverse();
        System.out.println(s2);
        
        StringBuffer s3 = new StringBuffer("Hello");
        s3.setCharAt(1,'x');
        System.out.println(s3);
        
        byte aa[] = { 65, 66, 67, 68, 69, 70 };
        byte bb[] = { 71, 72, 73, 74, 75, 76 };
        System.arraycopy(aa, 1, bb, 3, 0);
        System.out.print(new String(aa) + " " + new String(bb));
        
        
        System.out.println(fun());
        
        int i = 25;
        double d = 225.50;
        i = (int) d;
        System.out.print(i);
        
        int x=25;
        String sup = (x < 15) ? "Hack" : (x <22)? "Earth" : "Hi";
        System.out.println(sup);
        
        int i1 = 4;
        boolean t2 = true;
        boolean f = false, b;
        b = (t2 | ((i1++) == 0));
        b = (f | ((i1+=2) > 0));
        System.out.println(i1);
        
        
        System.out.println(true|false);
        
        int a1=32;
        System.out.println(a1>>2);
        
        int xx, yy;
        xx = 5 >> 2;
        yy = xx >>> 2;
        System.out.println(yy);
    }
    
    static int fun()
    {
	   return 20;
    }
  
}
