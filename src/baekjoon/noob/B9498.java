package baekjoon.noob;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Q. 시험 점수를 입력받아 90 ~ 100점은 A, 80 ~ 89점은 B, 70 ~ 79점은 C, 60 ~ 69점은 D, 나머지 점수는 F를 출력하는 프로그램을 작성하시오.
 *
 * Input. 첫째 줄에 시험 점수가 주어진다. 시험 점수는 0보다 크거나 같고, 100보다 작거나 같은 정수이다.
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
