public class SubString {
public static void main(String[] args){
		Scanner s=new Scanner (System.in);
		System.out.println("enter a string");
		String s1=s.nextLine();
		String s2=s.nextLine();
		if(s2.contains(s1)) {
			System.out.println(s2.indexOf(s1));
		}
		else {
			System.out.println("-1");	
		}

	}
}
