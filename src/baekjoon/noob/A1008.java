package baekjoon.noob;

import java.util.Scanner;

/**
 * Q. 두 정수 A와 B를 입력받은 다음, A/B를 출력하는 프로그램을 작성하시오
 *    -> 첫째 줄에 A와 B가 주어진다. (0 < A , B < 10)
 *
 * Example
 *    input -> 4 5
 *    result -> 0.8
 *
 * ** 조건
 *    단, 절대오차 또는 상대오차가 10^(-9) 이하면 정답이다.
 */
public class A1008 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /**
         * float는 절대오차가 4*10^(-8) 이다. 즉 실제 답과  0.000000040.. 된다.
         * double의 정밀도가 더 높기 때문에 double로 하게 된다면 절대오차가 10^(-9) 이하로 나온다.
         */
        double a = scanner.nextInt();
        double b = scanner.nextInt();

        System.out.println(a/b);
    }
}