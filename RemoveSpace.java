package com.steller;
import java.util.Scanner;
public class RemoveSpace {
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String str1=str.replaceAll(" ","");
		System.out.println(str1);
	}	
}
