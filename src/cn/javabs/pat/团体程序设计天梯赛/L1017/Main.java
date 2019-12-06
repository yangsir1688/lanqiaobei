package cn.javabs.pat.团体程序设计天梯赛.L1017;

import java.util.Scanner;

/**
 * L1-017 到底有多二 （15 分）
 * <p>
 * 注意各个系数可以用权重来表示，而初始化的时候定义为1，会让系数不受影响
 * 注意俩个数相除 要 *1.0 才不会完全进整数部分
 * 注意格式化输出format printf里 %的转意是%%（可以看源码和文档
 * Character.isDigit()在这里非常好用 ，另外关于char转int: Character.getNumericValue(ch);
 */
public class Main {
    public static void main(String[] args) {
        String str = new Scanner(System.in).next();
        int two = 0, length, isEven = 1;// 部分表示权重
        double isMinus = 1;
        char[] arr = str.toCharArray();

        // 判断是否为负数和位数
        if (Character.isDigit(arr[0]))
            length = arr.length;// 位数
        else {
            length = arr.length - 1;// 位数
            isMinus = 1.5;// 是负数
        }

        for (char each : arr) {
            if (each == '2')
                two++;// 2的位数
        }

        // 判断偶数
        String laststr = Character.toString(arr[arr.length - 1]);
        int lastdigital = Integer.parseInt(laststr);
        if (lastdigital % 2 == 0)
            isEven = 2;// 是偶数

        double result = (two * 1.0 / length) * isEven * isMinus * 100;
        // System.out.printf("%f %d %d %f%n", two, length, isEven, isMinus);
        System.out.printf("%.2f%%", result);
    }
}
