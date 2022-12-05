package baekjoon.noob;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Q. 서울의 오늘 날짜를 출력하는 프로그램 작성
 *    -> 서울의 오늘 날짜를 "YYYY-MM-DD" 형식으로 출력한다.
 *
 * Example. 2015-01-24
 */

public class A10699 {
    public static void main(String[] args){
        SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd");
        System.out.println(sdf.format(new Date()));
    }
}
