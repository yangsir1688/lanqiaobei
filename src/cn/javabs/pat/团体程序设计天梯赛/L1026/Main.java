package cn.javabs.pat.团体程序设计天梯赛.L1026;

/**
 * L1-026 I Love GPLT （5 分）
 */
public class Main {
    public static void main(String[] args) {
        // Mr.yang注: 只被使用一次的变量可以 inline 化
        // 例如 for (char each : "I Love GPLT".toCharArray())
        // 这样做可以有效提升代码可读性甚至还减少了变量取名的心智负担
        char[] arr = "I Love GPLT".toCharArray();
        for (char each : arr) {
            System.out.println(each);
        }
    }
}
