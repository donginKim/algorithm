
/**
 * 1. 상자놀이
 *
 * 춘식이는 한 줄로 이어진 상자들을 가지고 놀이를 준비하려고 한다
 * 놀이에는 정수 x,y,z 가 주어진다.
 * 춘식이는 왼쪽에서 x 번째 상자에서 놀이를 시작하고, 매 턴마다 오른쪽이나 왼쪽으로 한 칸씩 이동하여 y번째 상자에 도착해야한다.
 * 놀이를 진행하는 동안 최대 z번의 이동이 가능하며, 모든 이동 방향은 동일할 수 있다.
 * 춘식이가 놀이를 진행하며 도착할 수 있는 k 번째 상자 중, 가능한 k의 최댓값을 구하시오
 *
 *
 * Example
 * x = 4
 * y = 4
 * z = 4
 *
 * k의 최댓값은 6이다. 최대 4번의 이동이 가능하기 때문에, 4번째 상자에서 오른쪽으로 두번 이동하고 왼쪽으로 두번 이동해서 다시 4번째 상자에 도착할 수 있다.
 * 0 또는 2번의 이동으로도 4번째 상자에 도착할 수 있지만, 이 때 k의 최대값은 각각 4와 5이다.
 *
 * Function Description
 * 아래 편집기에서 solution 함수를 구현하시오
 *
 * solution 함수는 다음 인자를 갖는다.
 * int x : 시작 위치
 * int y : 목표 위치
 * int z : 최대 이동 수
 *
 * Returns
 * int : 최대 z번 이동 이내에 x번째 상자에서 y번째 상자로 이동하는 동안 춘식이가 도착할 수 있는 k번째 상자 중, 가능한 k의 최대값.
 * z 번 이동을 모두 수행하더라도 y 번째 상자에 도착할 수 없으면 -1을 반환
 *
 * Constraints
 * - 1 <= x,y,z <= 10^8
 *
 * Input Format For Custom Testing
 * stdin의 입력은 다음과 같이 처리되어 함수로 전달된다.
 * 첫번째 줄에는 정수 x, 두번째 줄에는 정수 y, 세번째 줄에는 정수 z가 있음
 */

public class Section1 {

    public static void main(String[] args) {
        int x = 9;
        int y = 10;
        int z = 3;

        int left = Math.min(x, y);
        int right = Math.max(x, y);

        int result = 0;

        if (right - left == 0) {
            result = z % 2 == 1 ? -1 : right + z/2;
        } else {
            int t = x;

            int x1 = x;
            int y1 = y;

            for (int i = 0; i < z; i ++){
                    if (x1 <= y1) {
                        x1 = x1 + 1;
                    } else if (x1 >= y1) {
                        x1 = x1 - 1;
                    }

                    if(t < x1){
                        t = x1;
                    }
            }

            if(x1==y){
                result = t;
            }else{
                result = -1;
            }

        }

        System.out.println(result);

    }

}
