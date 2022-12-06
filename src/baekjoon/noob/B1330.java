package baekjoon.noob;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Q. �� ���� A�� B�� �־����� ��, A�� B�� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 *
 * Input. ù° �ٿ� A�� B�� �־�����. A�� B�� ���� �� ĭ���� ���еǾ��� �ִ�.
 *
 * Output. ù° �ٿ� ���� �� ���� �� �ϳ��� ����Ѵ�.
 *          - A�� B���� ū ��쿡�� '>'�� ����Ѵ�.
 *          - A�� B���� ���� ��쿡�� '<'�� ����Ѵ�.
 *          - A�� B�� ���� ��쿡�� '=='�� ����Ѵ�.
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
