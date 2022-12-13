package baekjoon.noob;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Q. 첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
 *    하지만, 오른쪽을 기준으로 정렬한 별(예제 참고)을 출력하시오.
 *
 * Input. 첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.
 *
 * Output. 첫째 줄부터 N번째 줄까지 차례대로 별을 출력한다.
 *
 * Example
 *    input -> 5
 *
 *    result ->     *
 *                 **
 *                ***
 *               ****
 *              *****
 *
 */
public class C2439 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine());

        StringBuilder stringBuilder = new StringBuilder();

        for(int i = 0; i < n; i++){
            for (int z = n - 1; z > i; z--){
                stringBuilder.append(z);
            }
            for (int j = 0; j <= i; j++){
                stringBuilder.append("*");
            }
            stringBuilder.append("\n");
        }

        System.out.println(stringBuilder);

    }
}
