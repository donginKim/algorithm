package baekjoon.noob;

import java.util.Scanner;

/**
 * Q. �� ���� A�� B�� �Է¹��� ����, A+B, A-B, A*B, A/B(��), A%B(������)�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�
 *    -> �� �ڿ��� A�� B�� �־�����. (1 �� A, B �� 10,000)
 *
 * Example
 *    input -> 7 3
 *    result -> 10
 *              4
 *              21
 *              2
 *              1
 *
 */
public class A10869 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);


    }


}
