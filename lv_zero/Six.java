package Programmers_JuJu.lv_zero;

/*
*   -- 문제설명
*
*   문자열 my_string이 매개변수로 주어집니다. my_string을 거꾸로 뒤집은 문자열을 return하도록 solution 함수를 완성해주세요.
*
*   -- 제한사항
*
*   1 ≤ my_string의 길이 ≤ 1,000
*
* */

public class Six {
    public static void main(String[] args){
        System.out.println(solution("YEONJU"));
        System.out.println(solution("YOO"));
    }

    public static String solution(String my_string){
        StringBuffer sb = new StringBuffer(my_string);
        return sb.reverse().toString();
    }
}
