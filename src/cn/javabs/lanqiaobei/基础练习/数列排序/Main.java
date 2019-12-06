package cn.javabs.lanqiaobei.基础练习.数列排序;

import java.util.Scanner;
import java.util.Arrays;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdin = new Scanner(System.in);
		int n;
		n = stdin.nextInt();
		int[] numArray = new int[n];
	
		for(int i=0;i<n;i++) {
			numArray[i] = stdin.nextInt();
		}
		
		Arrays.sort(numArray);
		for(int i=0;i<numArray.length;i++) {
			System.out.print(numArray[i]+" ");
		}
	
		
	}

}
