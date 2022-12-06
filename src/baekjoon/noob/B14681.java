package baekjoon.noob;

import java.util.Scanner;

/**
 * Q. ���� ���� ���� �� �ϳ��� �־��� ���� ��� ��и鿡 ���ϴ��� �˾Ƴ��� ���̴�. ��и��� �Ʒ� �׸�ó�� 1���� 4���� ��ȣ�� ���´�. "Quadrant n"�� "��n��и�"�̶�� ���̴�.
 *    [src/static/img/B14681-0.png]
 *    ���� ���, ��ǥ�� (12, 5)�� �� A�� x��ǥ�� y��ǥ�� ��� ����̹Ƿ� ��1��и鿡 ���Ѵ�. �� B�� x��ǥ�� �����̰� y��ǥ�� ����̹Ƿ� ��2��и鿡 ���Ѵ�.
 *    ���� ��ǥ�� �Է¹޾� �� ���� ��� ��и鿡 ���ϴ��� �˾Ƴ��� ���α׷��� �ۼ��Ͻÿ�. ��, x��ǥ�� y��ǥ�� ��� ����� ������� �����Ѵ�.
 *
 * Input. ù �ٿ��� ���� x�� �־�����. (?1000 �� x �� 1000; x �� 0) ���� �ٿ��� ���� y�� �־�����. (?1000 �� y �� 1000; y �� 0)
 *
 * Output. �� (x, y)�� ��и� ��ȣ(1, 2, 3, 4 �� �ϳ�)�� ����Ѵ�.
 *
 * Example
 *    input ->
 *    1) 12
 *       5
 *    2) 9
 *       -13
 *
 *    result ->
 *    1) 1
 *    2) 4
 *
 */
public class B14681 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();


        if ( a > 0 ) {
            if( b > 0) {
                System.out.println("1");
            } else {
                System.out.println("4");
            }
        } else {
            if( b > 0) {
                System.out.println("2");
            } else {
                System.out.println("3");
            }
        }

    }
}
