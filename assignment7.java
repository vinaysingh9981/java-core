package newproject;

public class assignment7 {
 String sname; int age; int RN;
	public static void main(String[] args) {
		
		assignment7 obj = new assignment7();
		
		obj.sname = "vinay";
		obj.age = 12;
		obj.RN = 101;
		System.out.println("student name = "+obj.sname+", age="+obj.age+", roll no.="+obj.RN );
		
		obj.sname="sandeep";
		obj.age = 21;
		obj.RN = 102;
		
		System.out.println("student name = "+obj.sname+", age="+obj.age+", roll no.="+obj.RN );

	}

}
