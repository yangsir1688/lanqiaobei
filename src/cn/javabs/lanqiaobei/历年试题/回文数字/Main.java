package cn.javabs.lanqiaobei.历年试题.回文数字;


import java.util.Scanner;
import java.util.Arrays;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stdin = new Scanner(System.in);
		int num=stdin.nextInt();
		boolean satisFlag=false;
		int[] result=new int[10000];
		Arrays.fill(result, -1);
		int index=0;
		for(int i=0;i<10;i++)    
			for(int j=0;j<10;j++)
				for(int k=0;k<10;k++) {
					//处理6位数
					if((i+k+j)*2==num && i!=0) { 
						int tmp = i*100000+j*10000+k*1000+k*100+j*10+i;
						if(tmp>10000) {	//确保是5或6位数
							result[index] = tmp;
							index++;
						}
					}
					//处理5位数
					if(((i+j)*2+k)==num) {
						int tmp = i*10000+j*1000+k*100+j*10+i;
						if(tmp>10000) {
							result[index] = tmp;
							index++;
						}
					}
					
				}
		
		
		Arrays.sort(result);
		for(int i=0;i<result.length;i++) {
			if(result[i]==-1 )
				continue;
			System.out.println(result[i]);
			satisFlag=true;
		}
		if(satisFlag==false)
			System.out.println(-1);
	}
}