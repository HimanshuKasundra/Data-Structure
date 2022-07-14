class Student
{
	int rollNo;
	String name;
	
	public Student(int rollNo,String name)
	{
		this.rollNo=rollNo;
		this.name=name;
	}
	void PrintStudentDetails()
	{
		System.out.println(rollNo+"  "+name);
	}
}

public class ArrayOfObject
{
	public static void main(String[] args)
	{
		Student[] stu=new Student[2];
		
		stu[0]=new Student(101,"Himanshu");
		stu[1]=new Student(102,"krish");
		
		stu[0].PrintStudentDetails();
		stu[1].PrintStudentDetails();
	}
	
}