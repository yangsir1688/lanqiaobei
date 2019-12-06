package cn.javabs.lanqiaobei.入门训练.圆的面积;

import java.util.Scanner;

public class Main {
	final static double PI=3.14159265358979323;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner stdin = new Scanner(System.in);
		double R = stdin.nextDouble();
		double AreaCircle = PI*R*R;
		System.out.println(String.format("%.7f", AreaCircle));
	}

}

/*
4
50.2654825
*/