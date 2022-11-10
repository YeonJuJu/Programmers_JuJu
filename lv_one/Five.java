package Programmers_JuJu.lv_one;

/*
 *   -- 문제설명
 *
 *   자연수 n을 뒤집어 각 자리 숫자를 원소로 가지는 배열 형태로 리턴해주세요. 예를들어 n이 12345이면 [5,4,3,2,1]을 리턴합니다.
 *
 *   -- 제한사항
 *
 *   n은 10,000,000,000이하인 자연수입니다.
 *
 * */

import java.util.Arrays;

public class Five {
    public static void main(String[] args){
        System.out.println(solution(12345));
        System.out.println(bestSolution(13131));
    }

    public static int[] solution(long n) {
        int[] answer = new int[Long.toString(n).length()];
        long tmp = n;
        int idx = 0;

        while(tmp>0){
            answer[idx] = (int) (tmp%10);
            tmp /= 10;
            idx++;
        }
        return answer;
    }

    public static int[] bestSolution(long n){
        return new StringBuilder().append(n).reverse().chars().map(Character::getNumericValue).toArray();
    }
}
