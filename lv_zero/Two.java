package Programmers_JuJu.lv_zero;

/*
 *   -- 문제설명
 *
 *   정수 num1과 num2가 주어질 때, num1에서 num2를 뺀 값을 return하도록 soltuion 함수를 완성해주세요.
 *
 *   -- 제한사항
 *
 *   -50000 ≤ num1 ≤ 50000
 *   -50000 ≤ num2 ≤ 50000
 *
 * */

public class Two {
    public static void main(String[] args){
        System.out.println(solution(1, 1));
        System.out.println(solution(1, -1));
    }

    public static int solution(int num1, int num2){
        return num1 - num2;
    }
}