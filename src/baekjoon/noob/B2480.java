package baekjoon.noob;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Q.1에서부터 6까지의 눈을 가진 3개의 주사위를 던져서 다음과 같은 규칙에 따라 상금을 받는 게임이 있다.
 *     1)같은 눈이 3개가 나오면 10,000원+(같은 눈)×1,000원의 상금을 받게 된다.
 *     2)같은 눈이 2개만 나오는 경우에는 1,000원+(같은 눈)×100원의 상금을 받게 된다.
 *     3)모두 다른 눈이 나오는 경우에는 (그 중 가장 큰 눈)×100원의 상금을 받게 된다.
 *   예를 들어, 3개의 눈 3, 3, 6이 주어지면 상금은 1,000+3×100으로 계산되어 1,300원을 받게 된다.
 *   또 3개의 눈이 2, 2, 2로 주어지면 10,000+2×1,000 으로 계산되어 12,000원을 받게 된다. 3개의 눈이 6, 2, 5로 주어지면 그중 가장 큰 값이 6이므로 6×100으로 계산되어 600원을 상금으로 받게 된다.
 *   3개 주사위의 나온 눈이 주어질 때, 상금을 계산하는 프로그램을 작성 하시오.
 *
 * Input. 첫째 줄에 3개의 눈이 빈칸을 사이에 두고 각각 주어진다.
 *
 * Output. 첫째 줄에 게임의 상금을 출력 한다.
 *
 * Example
 *    input ->
 *    1) 3 3 6
 *    2) 2 2 2
 *    3) 6 2 5
 *
 *    result ->
 *    1) 1300
 *    2) 12000
 *    3) 600
 *
 */
public class B2480 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        int a = Integer.parseInt(stringTokenizer.nextToken());
        int b = Integer.parseInt(stringTokenizer.nextToken());
        int c = Integer.parseInt(stringTokenizer.nextToken());

        if ( a!=b && b!=c && a!=c ) {
            int max = Math.max(a, Math.max(c, b));
            System.out.println(max * 100);
        } else if ( a == b && b == c ) {
            System.out.println(10000 + a * 1000);
        } else if ( a == b || a == c ) {
            System.out.println(1000 + a * 100);
        } else {
            System.out.println(1000 + b * 100);
        }

    }
}

/**
 * 다른 사람의 답
 *
 * import java.util.*;
 *
 * public class Main {
 *     public static void main(String[] args){
 *         Scanner sc = new Scanner(System.in);
 *         TreeSet<Integer> nSet = new TreeSet();
 *         int result=0;
 *         int addPoint=0;
 *         int multiPoint=0;
 *         int dupNumber=0;
 *         int tmp=0;
 *
 *         for(int i=0; i<3; i++){
 *             tmp = sc.nextInt();
 *             if(!nSet.add(Integer.valueOf(tmp))) {
 *                 dupNumber = tmp;
 *             }
 *         }
 *
 *         if(nSet.size() == 1){
 *             addPoint = 10000;
 *             multiPoint = 1000;
 *         } else if(nSet.size() == 2){
 *             addPoint = 1000;
 *             multiPoint = 100;
 *         } else {
 *             multiPoint = 100;
 *             dupNumber = nSet.last().intValue();
 *         }
 *         result = addPoint + (multiPoint*dupNumber);
 *
 *         System.out.println(result);
 *     }
 * }
 */