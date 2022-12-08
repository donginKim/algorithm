package baekjoon.noob;

import java.util.Scanner;

/**
 * Q. 두 정수 A와 B를 입력받은 다음, A-B를 출력하는 프로그램을 작성하시오
 *    -> 첫째 줄에 A와 B가 주어진다. (0 < A , B < 10)
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