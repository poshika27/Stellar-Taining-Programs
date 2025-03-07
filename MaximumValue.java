package com.steller;
import java.util.*;
import java.util.Scanner;
public class MaximumValue {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size: ");
		int n=sc.nextInt();
		int a[]=new int[n];
		int max=0;
		System.out.println("Enter value: ");
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
			
		}
		max=a[0];
		for(int i=1;i<n;i++)
		{
			if(a[i]>max) {
				max=a[i];
			}
		}
		System.out.println("Maximum value: "+max);
	}

}
