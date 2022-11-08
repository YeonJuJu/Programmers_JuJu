package Programmers_JuJu.lv_one;

/*
 *   -- 문제설명
 *
 *   자연수 N이 주어지면, N의 각 자릿수의 합을 구해서 return 하는 solution 함수를 만들어 주세요.
 *   예를들어 N = 123이면 1 + 2 + 3 = 6을 return 하면 됩니다.
 *
 *   -- 제한사항
 *
 *   N의 범위 : 100,000,000 이하의 자연수
 *
 * */

import java.util.ArrayList;
import java.util.Scanner;

public class Four {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        System.out.println(bestSolution(num));
    }

    public static int solution(int num){
        int total = 0;
        String numStr = Integer.toString(num);
        char[] numArr = numStr.toCharArray();

        for(int i=0;i<numArr.length;i++)
            total += Character.getNumericValue(numArr[i]);

        return total;
    }

    public static int bestSolution(int num){
        int answer = 0;

        while(num>0){
            answer+=num%10;
            num=num/10;
        }

        return answer;
    }
}
