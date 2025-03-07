public class ReverseWord {
public static void main(String[] args){
		Scanner s=new Scanner (System.in);
		System.out.println("enter a string");
		String s1=s.nextLine();
		System.out.println(reverseWord(s1.trim()));
	}
	private static String reverseWord(String str) {
		 if (!str.contains(" ")) {
	            return str;}
	
		int s2=str.lastIndexOf(" ");
		return(str.substring(s2+1))+" "+reverseWord(str.substring(0,s2));	
	}
}
