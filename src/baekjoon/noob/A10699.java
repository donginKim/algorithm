package baekjoon.noob;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Q. ������ ���� ��¥�� ����ϴ� ���α׷� �ۼ�
 *    -> ������ ���� ��¥�� "YYYY-MM-DD" �������� ����Ѵ�.
 *
 * Example. 2015-01-24
 */

public class A10699 {
    public static void main(String[] args){
        SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-dd");
        System.out.println(sdf.format(new Date()));
    }
}
