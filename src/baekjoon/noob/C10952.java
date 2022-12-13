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
 * Output. 각 테스트 케이스마다 A+B를 출력한다.
 *
 * Example
 *    input -> 5
 *             1 1
 *             2 3
 *             3 4
 *             9 8
 *             5 2
 *             0 0
 *
 *    result -> 2
 *              5
 *              7
 *              17
 *              7
 *
 */
public class C10952 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        while(true){
            StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int a = Integer.parseInt(stringTokenizer.nextToken());
            int b = Integer.parseInt(stringTokenizer.nextToken());

            if(a != 0) {
                System.out.println(a + b);
            }else{
                break;
            }
        }
    }
}
