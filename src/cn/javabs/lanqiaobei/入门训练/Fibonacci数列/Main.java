package cn.javabs.lanqiaobei.入门训练.Fibonacci数列;

import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdin = new Scanner(System.in);
		int numFibo = stdin.nextInt();
		int result=0;
		int f1=1,f2=1;
		if(numFibo==1)
			result = f1;
		else if(numFibo==2)
			result=f2;
		else {
			for(int i=3;i<=numFibo;i++) {
				result = (f1+f2)%10007;
				f1=f2;
				f2=result;
			}
		}
		System.out.println(result);
	}
}
