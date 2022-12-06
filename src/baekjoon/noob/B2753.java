package baekjoon.noob;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Q. ������ �־����� ��, �����̸� 1, �ƴϸ� 0�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 *    ������ ������ 4�� ����̸鼭, 100�� ����� �ƴ� �� �Ǵ� 400�� ����� ���̴�.
 *    ���� ���, 2012���� 4�� ����̸鼭 100�� ����� �ƴ϶� �����̴�. 1900���� 100�� ����̰� 400�� ����� �ƴϱ� ������ ������ �ƴϴ�. ������, 2000���� 400�� ����̱� ������ �����̴�.
 *
 * Input. ù° �ٿ� ������ �־�����. ������ 1���� ũ�ų� ����, 4000���� �۰ų� ���� �ڿ����̴�.
 *
 * Output. ù° �ٿ� �����̸� 1, �ƴϸ� 0�� ����Ѵ�.
 *
 * Example
 *    input -> 1) 2000
 *             2) 1999
 *
 *    result -> 1) 1
 *              2) 0
 *
 */
public class B2753 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(bufferedReader.readLine());

        if ( a % 4 == 0 ) {
            if ( a % 100 != 0 || a % 400 == 0 && a % 4 ==0 ) {
                System.out.println("1");
            } else {
                System.out.println("0");
            }
        } else {
            System.out.println("0");
        }

    }
}

/**
 * �ٸ� ��� ��
 *
 * import java.util.Scanner;
 *
 * public class Main {
 * 	public static void main(String []args) {
 * 		Scanner sc = new Scanner(System.in);
 * 		int year = sc.nextInt();
 * 		if(year%4 == 0 && year%100 != 0 || year%400 == 0) {
 * 			System.out.println(1);
 *                }else {
 * 			System.out.println(0);
 *        }* 	}
 * }
 */
