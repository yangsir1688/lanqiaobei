package cn.javabs.pat.团体程序设计天梯赛.L1008;

import java.util.Scanner;

/**
 * L1-008 求整数段和 （10 分）
 * <p>
 * 这个题考察格式化输出，注意考虑各种换行、占位符的可能情况
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = scanner.nextInt();
        int end = scanner.nextInt();

        int sum = 0;
        int count = 0;
        for (; start <= end; start++) {
            System.out.printf("%5d", start);
            sum = sum + start;
            count++;
            if (count % 5 == 0 && start != end) {
                System.out.println();
            }
        }
        System.out.format("%nSum = ", sum);

    }
}
