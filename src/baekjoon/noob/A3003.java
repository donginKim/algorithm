package baekjoon.noob;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Q. �����̴� ������ â�� �����ٰ� ���� ü���ǰ� �ǽ��� �߰��ߴ�.
 *    ü������ ������ �о�� �ɷ��� ������ �׷����� ������ ü������ �Ǿ���. ������, ������ �ǽ��� ��� �־�����, ��� �ǽ��� ������ �ùٸ��� �ʾҴ�.
 *    ü���� �� 16���� �ǽ��� ����ϸ�, ŷ 1��, �� 1��, �� 2��, ��� 2��, ����Ʈ 2��, �� 8���� �����Ǿ� �ִ�.
 *    �����̰� �߰��� ��� �ǽ��� ������ �־����� ��, �� ���� ���ϰų� ���� �ùٸ� ��Ʈ�� �Ǵ��� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 *
 * Input. ù° �ٿ� �����̰� ã�� ��� ŷ, ��, ��, ���, ����Ʈ, ���� ������ �־�����. �� ���� 0���� ũ�ų� ���� 10���� �۰ų� ���� �����̴�.
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
 * �ٸ� ��� ��
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