package baekjoon.noob;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Q. (세 자리 수) × (세 자리 수)는 다음과 같은 과정을 통하여 이루어진다.
 *     [src/static/img/A2588-0.png]
 *     (1)과 (2)위치에 들어갈 세 자리 자연수가 주어질 때 (3), (4), (5), (6)위치에 들어갈 값을 구하는 프로그램을 작성하시오.
 *
 * Input. 첫째 줄에 (1)의 위치에 들어갈 세 자리 자연수가, 둘째 줄에 (2)의 위치에 들어갈 세자리 자연수가 주어진다.
 *
 * Output. 첫째 줄부터 넷째 줄까지 차례대로 (3), (4), (5), (6)에 들어갈 값을 출력한다.
 *
 * Example
 *    input -> 472
 *             385
 *    result -> 2360
 *              3776
 *              1416
 *              181720
 *
 */
public class A2588 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(bufferedReader.readLine());
        String b = bufferedReader.readLine();
        char[] bArray = b.toCharArray();
        for (int i=bArray.length-1; i >= 0; i--){
            System.out.println(Character.getNumericValue(bArray[i]) * a);
        }
        System.out.println(a * Integer.parseInt(b));

    }
}

/**
 * 다른 사람 답
 * import java.util.*;
 *
 * public class Main{
 *     public static void main(String[] args) {
 *         Scanner scan = new Scanner(System.in);
 *         int x = scan.nextInt();
 *         int y = scan.nextInt();
 *
 *         System.out.println(x*(y%10));
 *         System.out.println(x*(int)((y%100)/10));
 *         System.out.println(x*(int)(y/100));
 *         System.out.println(x*y);
 *     }
 * }
 *
 */