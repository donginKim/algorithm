package baekjoon.noob;

import java.util.Scanner;

/**
 * Q. 두 정수 A와 B를 입력받은 다음, A+B, A-B, A*B, A/B(몫), A%B(나머지)를 출력하는 프로그램을 작성하시오
 *    -> 두 자연수 A와 B가 주어진다. (1 ≤ A, B ≤ 10,000)
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