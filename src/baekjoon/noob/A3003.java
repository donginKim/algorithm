package baekjoon.noob;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Q. 동혁이는 오래된 창고를 뒤지다가 낡은 체스판과 피스를 발견했다.
 *    체스판의 먼지를 털어내고 걸레로 닦으니 그럭저럭 쓸만한 체스판이 되었다. 하지만, 검정색 피스는 모두 있었으나, 흰색 피스는 개수가 올바르지 않았다.
 *    체스는 총 16개의 피스를 사용하며, 킹 1개, 퀸 1개, 룩 2개, 비숍 2개, 나이트 2개, 폰 8개로 구성되어 있다.
 *    동혁이가 발견한 흰색 피스의 개수가 주어졌을 때, 몇 개를 더하거나 빼야 올바른 세트가 되는지 구하는 프로그램을 작성하시오.
 *
 * Input. 첫째 줄에 동혁이가 찾은 흰색 킹, 퀸, 룩, 비숍, 나이트, 폰의 개수가 주어진다. 이 값은 0보다 크거나 같고 10보다 작거나 같은 정수이다.
 *
 * Example
 *    input -> 0 1 2 2 2 7
 *    result -> 1 0 0 0 0 1
 *
 */
public class A3003 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        int size = stringTokenizer.countTokens();
        int[] chess = {1, 1, 2, 2, 2, 8};

        String result = "";
        for(int i=0; i<size; i++){
           result += chess[i] - Integer.parseInt(stringTokenizer.nextToken());
           if (i != size-1){
               result += " ";
           }
        }
        System.out.println(result);
    }
}

/**
 * 다른 사람 답
 *
 *   import java.io.BufferedReader;
 *   import java.io.InputStreamReader;
 *   import java.io.IOException;
 *   import java.util.StringTokenizer;
 *
 * public class Main {
 * 	public static void main(String[] args) throws IOException {
 *
 * 		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 *
 * 		int king = 1;
 * 		int queen = 1;
 * 		int rook = 2;
 * 		int bishop = 2;
 * 		int knight = 2;
 * 		int pawn = 8;
 *
 * 		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
 * 		king = king - Integer.parseInt(st.nextToken());
 * 		queen = queen - Integer.parseInt(st.nextToken());
 * 		rook = rook - Integer.parseInt(st.nextToken());
 * 		bishop = bishop - Integer.parseInt(st.nextToken());
 * 		knight = knight - Integer.parseInt(st.nextToken());
 * 		pawn = pawn - Integer.parseInt(st.nextToken());
 *
 * 		System.out.print(king + " ");
 * 		System.out.print(queen + " ");
 * 		System.out.print(rook + " ");
 * 		System.out.print(bishop + " ");
 * 		System.out.print(knight + " ");
 * 		System.out.print(pawn + " ");
 *
 *        }
 * }
 */