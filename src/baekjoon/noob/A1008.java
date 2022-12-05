package baekjoon.noob;

import java.util.Scanner;

/**
 * Q. �� ���� A�� B�� �Է¹��� ����, A/B�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�
 *    -> ù° �ٿ� A�� B�� �־�����. (0 < A , B < 10)
 *
 * Example
 *    input -> 4 5
 *    result -> 0.8
 *
 * ** ����
 *    ��, ������� �Ǵ� �������� 10^(-9) ���ϸ� �����̴�.
 */
public class A1008 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /**
         * float�� ��������� 4*10^(-8) �̴�. �� ���� ���  0.000000040.. �ȴ�.
         * double�� ���е��� �� ���� ������ double�� �ϰ� �ȴٸ� ��������� 10^(-9) ���Ϸ� ���´�.
         */
        double a = scanner.nextInt();
        double b = scanner.nextInt();

        System.out.println(a/b);
    }


}
