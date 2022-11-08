package Programmers_JuJu.lv_one;

/*
 *   -- 문제설명
 *
 *   정수 n을 입력받아 n의 약수를 모두 더한 값을 리턴하는 함수, solution을 완성해주세요.
 *
 *   -- 제한사항
 *
 *   n은 0 이상 3000이하인 정수입니다.
 *
 * */

import java.util.Arrays;
import java.util.Scanner;

public class Three {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println(solution(num));
    }

    public static int solution(int num){
        int total = 0;

        for(int i=1;i<=num;i++)
            if(num%i == 0)
                total+=i;

        return total;
    }

    public static int bestSolution(int num){
        int answer = 0;
        for(int i = 1; i <= num/2; i++){
            if(num%i == 0) answer += i;
        }
        return answer+num;
    }
}
