package baekjoon.noob;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Q. 두 정수 A와 B가 주어졌을 때, A와 B를 비교하는 프로그램을 작성하시오.
 *
 * Input. 첫째 줄에 A와 B가 주어진다. A와 B는 공백 한 칸으로 구분되어져 있다.
 *
 * Output. 첫째 줄에 다음 세 가지 중 하나를 출력한다.
 *          - A가 B보다 큰 경우에는 '>'를 출력한다.
 *          - A가 B보다 작은 경우에는 '<'를 출력한다.
 *          - A와 B가 같은 경우에는 '=='를 출력한다.
 *
 * Example
 *    input ->
 *    1) 1 2
 *    2) 10 2
 *    3) 5 5
 *
 *    result ->
 *    1) <
 *    2) >
 *    3) ==
 */
public class B1330 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        int a = Integer.parseInt(stringTokenizer.nextToken());
        int b = Integer.parseInt(stringTokenizer.nextToken());

        if (a > b){
            System.out.println(">");
        } else if (a < b) {
            System.out.println("<");
        } else if (a == b) {
            System.out.println("==");

        }

    }
}