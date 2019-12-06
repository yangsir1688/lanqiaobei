package cn.javabs.pat.团体程序设计天梯赛.L1013;

import java.util.Scanner;

/**
 * 本以为这是个很简单的问题。。但是被自己复杂化了，其实回过头看，分俩步：
 * 1. 求1！～N！的和 2. 求每一个i！的值，这里自减迭代自身
 * <p>
 * 另外，这个解法有点意思...
 * //Mr.yang注: 这种方案叫做 硬编码
 * <pre>
 * String[] factorials = new String[] {
 *  "1",
 *  "1",
 *  "3",
 *  "9",
 *  "37",
 *  "169",
 *  "981",
 *  "6429",
 *  "49669",
 *  "430861",
 *  "4208925",
 *  "45345165",
 *  "536229373",
 *  "6884917597",
 *  "95473049469",
 *  "1420609412637",
 *  "22580588347741",
 *  "381713065286173"
 * };
 * </pre>
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        int S = 0;
        for (int i = 1; i <= N; i++) {
            int k = 1;
            for (int j = i; j > 0; j--) {
                k = k * j;
            }
            S = S + k;
        }

        System.out.println(S);
    }
}
