package baekjoon.noob;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Q. 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
 *
 * Input. 첫째 줄에 테스트 케이스의 개수 T가 주어진다.
 *        각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
 *
 * Output. 각 테스트 케이스마다 "Case #x: "를 출력한 다음, A+B를 출력한다. 테스트 케이스 번호는 1부터 시작한다.
 *
 * Example
 *    input -> 5
 *             1 1
 *             2 3
 *             3 4
 *             9 8
 *             5 2
 *
 *    result -> Case #1: 2
 *              Case #2: 5
 *              Case #3: 7
 *              Case #4: 17
 *              Case #5: 7
 *
 */
public class C11021 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(bufferedReader.readLine());

        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 1; i <= t; i++){
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            stringBuilder.append("Case #").append(i).append(": ").append(Integer.parseInt(stringTokenizer.nextToken()) + Integer.parseInt(stringTokenizer.nextToken())).append("\n");
        }

        System.out.println(stringBuilder);
    }
}
