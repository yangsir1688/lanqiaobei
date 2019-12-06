package cn.javabs.lanqiaobei.算法训练.p0103;


import java.util.Scanner;
public class Main {
	//输入一个大写字母将它转换成小写
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner stdin = new Scanner(System.in);
		char inputChar = stdin.next(".").charAt(0);
	
		char resultChar=' ';
		if(inputChar>='A'&&inputChar<='Z')
			resultChar = (char)(inputChar+32);
//		char resultChar = Character.toLowerCase(inputChar);
		System.out.println(resultChar);
		
		String inputStr = stdin.next();
		System.out.println(inputStr);
	
		inputStr = stdin.next();
		System.out.println(inputStr);
		stdin.close();
	}
}
