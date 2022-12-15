package baekjoon.noob;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Q. 0보다 크거나 같고, 99보다 작거나 같은 정수가 주어질 때 다음과 같은 연산을 할 수 있다. 먼저 주어진 수가 10보다 작다면 앞에 0을 붙여 두 자리 수로 만들고, 각 자리의 숫자를 더한다. 그 다음, 주어진 수의 가장 오른쪽 자리 수와 앞에서 구한 합의 가장 오른쪽 자리 수를 이어 붙이면 새로운 수를 만들 수 있다. 다음 예를 보자.
 *    26부터 시작한다. 2+6 = 8이다. 새로운 수는 68이다. 6+8 = 14이다. 새로운 수는 84이다. 8+4 = 12이다. 새로운 수는 42이다. 4+2 = 6이다. 새로운 수는 26이다.
 *    위의 예는 4번만에 원래 수로 돌아올 수 있다. 따라서 26의 사이클의 길이는 4이다.
 *    N이 주어졌을 때, N의 사이클의 길이를 구하는 프로그램을 작성하시오.
 *
 * Input. 첫째 줄에 N이 주어진다. N은 0보다 크거나 같고, 99보다 작거나 같은 정수이다.
 *
 * Output. 첫째 줄에 N의 사이클 길이를 출력한다.
 *
 * Example
 *    input -> 1) 26
 *             2) 55
 *             3) 1
 *             4) 0
 *             5) 71
 *
 *    result -> 1) 4
 *              2) 3
 *              3) 60
 *              4) 1
 *              5) 11
 *
 */
public class C1110 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String n = bufferedReader.readLine();

        int i = 0;
        int j = 0;
        int k = 0;
        int count = 0;

        while(true){
            String[] subString = {};
            count ++;

            if (count==1){
                subString = n.split("");
                if(subString.length != 2){
                    i = 0;
                    j = Integer.parseInt(subString[0]);
                } else {
                    i = Integer.parseInt(subString[0]);
                    j = Integer.parseInt(subString[1]);
                }
            } else {
                subString = String.valueOf(k).split("");
                    i = j;
                    j = Integer.parseInt(subString[subString.length-1]);
            }

            k = i + j;
            System.out.println(i + " + " + j + " = " + k + " / " + count);


            //if(k == Integer.parseInt(n)){
            if (j == Integer.parseInt(n.split("")[0]) && k == Integer.parseInt()){
                break;
            }
        }

        System.out.println(count);
    }
}
