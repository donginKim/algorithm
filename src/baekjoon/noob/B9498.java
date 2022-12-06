package baekjoon.noob;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Q. ���� ������ �Է¹޾� 90 ~ 100���� A, 80 ~ 89���� B, 70 ~ 79���� C, 60 ~ 69���� D, ������ ������ F�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
 *
 * Input. ù° �ٿ� ���� ������ �־�����. ���� ������ 0���� ũ�ų� ����, 100���� �۰ų� ���� �����̴�.
 *
 * Example
 *    input -> 100
 *
 *    result -> A
 *
 */
public class B9498 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(bufferedReader.readLine());

        if(100 == a || a >= 90) {
            System.out.println("A");
        } else if (89 <= a || a >= 80) {
            System.out.println("B");
        } else if (79 <= a || a >= 70) {
            System.out.println("C");
        } else if (69 <= a || a >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }

    }
}
