package cn.javabs.lanqiaobei.基础训练.B5;

import java.util.Scanner;

/**
 * 这里有个坑:输入第二行数据之后,要先nextLine()以换行符截断一下,不然最后输入的待查数a获取不到
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr1 = new int[n];

        for (int i = 0; i < n; i++) {
            arr1[i] = scanner.nextInt();
        }

        scanner.nextLine();
        int a = scanner.nextInt();
        int location_a = -1;    //Mr.yang注: 变量名请用小驼峰 locationA

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == a) {
                location_a = i + 1;
                break;
            }
        }
        System.out.print(location_a);
    }
}
