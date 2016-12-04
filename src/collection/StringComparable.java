package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class StringComparable {

	public static void main(String[] args) {

		ArrayList al = new ArrayList();
		al.add(new Student(101, "Vijay", 23));
		al.add(new Student(106, "Ajay", 27));
		al.add(new Student(105, "Jai", 21));

		Collections.sort(al);
		Iterator itr = al.iterator();
		while (itr.hasNext()) {
			Student st = (Student) itr.next();
			System.out.println(st.rollno + " " + st.name + " " + st.age);
		}

	}

}

/*class Student {
	int rollno;
	String name;
	int age;

	Student(int rollno, String name, int age) {
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}
}
*/

  class Student implements Comparable { int rollno; String name; int age;
  
  Student(int rollno, String name, int age) { this.rollno = rollno; this.name =
  name; this.age = age; }
 
  @Override public int compareTo(Object o) { Student s1=(Student)o;
  
  return (this.name).compareTo(s1.name);
  }
  }
  
  

class NameComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		Student s1 = (Student) o1;
		Student s2 = (Student) o2;
		return s1.name.compareTo(s2.name);
	}
}
