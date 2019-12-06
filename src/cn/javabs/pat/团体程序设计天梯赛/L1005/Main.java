package cn.javabs.pat.团体程序设计天梯赛.L1005;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 * L1-005 考试座位号 （15 分）
 * <p>
 * <p>
 * 这道题输入要用 BufferedReader 和InputStreamReader 用Scanner读入数据应该就gg了
 * <p>
 * map存储数据 key:value 为 试机号:其他信息 ，注意如果是Map<Long>，那么map.get(1L)而不是map.get(1)
 * 这里面读入查询数据那里有点坑: 一行 String 转 int :
 * <p>
 * 思路一:str.split(" ")然后遍历 Integer.parseInt()
 * 也可以char[] arr = str.toCharArr() 然后（先转String再转为int）
 * 最后遍历 Integer.parseInt(String.valueOf(arr[0]))或者Integer.parseInt(Character.toString(arr[0]))
 * 或者最后遍历(int)arr[0]-(int)('0') 这里避免直转为Unicode码
 * <p>
 * 思路二：暴力存为一个String（因为输入的数据肯定是正确的，可以存储在一个字符串里面，然后split再比对，查找)
 * 思路三：用二维数组来存
 * <p>
 * 做这种题的时候没头绪很乱的时候一步一步的分块做，边做边调试，还得看获取到的数组一样与否
 * 普天同庆，这道题终于AC了
 */
public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // N组数据
        int N = Integer.parseInt(br.readLine());

        Map<Integer, String> map = new HashMap<>();

        // 录入信息每一行到存储到map
        for (int i = 0; i < N; i++) {
            String str = br.readLine();

            String[] strArr = str.split(" ");
            int id = Integer.parseInt(strArr[1]);
            String info = strArr[0] + " " + strArr[2];

            map.put(id, info);
        }
        //
        // 输入查询信息(试机座位号)
        int n = Integer.parseInt(br.readLine());
        String[] chaxun = br.readLine().split(" ");

        // 查询
        for (String each : chaxun) {
            System.out.println(map.get(Integer.parseInt(each)));
        }
    }
}
