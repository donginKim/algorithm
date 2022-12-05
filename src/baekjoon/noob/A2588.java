package baekjoon.noob;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Q. (�� �ڸ� ��) �� (�� �ڸ� ��)�� ������ ���� ������ ���Ͽ� �̷������.
 *     [src/static/img/A2588-0.png]
 *     (1)�� (2)��ġ�� �� �� �ڸ� �ڿ����� �־��� �� (3), (4), (5), (6)��ġ�� �� ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 *
 * Input. ù° �ٿ� (1)�� ��ġ�� �� �� �ڸ� �ڿ�����, ��° �ٿ� (2)�� ��ġ�� �� ���ڸ� �ڿ����� �־�����.
 *
 * Output. ù° �ٺ��� ��° �ٱ��� ���ʴ�� (3), (4), (5), (6)�� �� ���� ����Ѵ�.
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
 * �ٸ� ��� ��
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