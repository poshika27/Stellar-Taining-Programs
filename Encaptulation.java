import java.util.Scanner;
class Student{
	private int id;
	private String name;
	public int getid() {
		return id;
	}
	public String  getName() {
		return name;
	}
	public void setid(int id) {
		this.id=id;
		}
	public void setName(String name) {
		this.name=name;
	}
	
	public void disply() {
		System.out.println("Student id:"+id+"Student name:"+name);
	}
}
public class Encaptulation {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the id");
		int id=sc.nextInt();
		System.out.println("enter the name");
		sc.nextLine();
		String name=sc.nextLine();
		Student s=new Student();
		s.setid(id);
		s.setName(name);
		System.out.println(s.getid());
		System.out.println(s.getName());
		s.disply();	
	}
}
