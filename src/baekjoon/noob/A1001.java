package baekjoon.noob;

import java.util.Scanner;

/**
 * Q. �� ���� A�� B�� �Է¹��� ����, A-B�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�
 *    -> ù° �ٿ� A�� B�� �־�����. (0 < A , B < 10)
 *
 * Example
 *    input -> 1 2
 *    result -> 1
 */
public class A1001 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println(a-b);
    }


}
