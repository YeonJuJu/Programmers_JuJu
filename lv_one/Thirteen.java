package Programmers_JuJu.lv_one;

/*
 *   옹알이2
 * 
 *   -- 문제설명
 *
 *   머쓱이는 태어난 지 11개월 된 조카를 돌보고 있습니다.
 *   조카는 아직 "aya", "ye", "woo", "ma" 네 가지 발음과 네 가지 발음을 조합해서 만들 수 있는 발음밖에 하지 못하고 연속해서 같은 발음을 하는 것을 어려워합니다.
 *   문자열 배열 babbling이 매개변수로 주어질 때, 머쓱이의 조카가 발음할 수 있는 단어의 개수를 return하도록 solution 함수를 완성해주세요.
 *
 *   -- 제한사항
 *
 *   1 ≤ babbling의 길이 ≤ 100
 *   1 ≤ babbling[i]의 길이 ≤ 30
 *   문자열은 알파벳 소문자로만 이루어져 있습니다.
 *
 * */

import java.util.Stack;

public class Thirteen {
    public static void main(String[] args){
        System.out.println(solution(new String[] {"aya", "yee", "u", "maa"}));
        System.out.println(solution(new String[] {"ayaye", "uuu", "yeye", "yemawoo", "ayaayaa"}));
    }

    public static int solution(String[] babbling) {
        int answer = 0;

        String[] originalBabList = {"aya", "ye", "woo", "ma"};
        String[] repeatBabList = {"ayaaya", "yeye", "woowoo", "mama"};

        for (String bab : babbling) {
            for (String rBab : repeatBabList) {
                bab = bab.replace(rBab, "X");
            }

            for (String oBab : originalBabList) {
                bab = bab.replace(oBab, "?");
            }

            int sign = 0;

            for (int i = 0; i < bab.length(); i++) {
                if (!bab.subSequence(i, i + 1).equals("?")) {
                    sign = 1;
                    break;
                }
            }

            if (sign == 0)
                answer++;
        }

        return answer;
    }

    public static int bestSolution(String[] babbling){
        int answer = 0;

        for (int i = 0; i < babbling.length; i++) {
            if (babbling[i].contains("ayaaya") || babbling[i].contains("mama") || babbling[i].contains("woowoo") || babbling[i].contains("yeye"))
                continue;

            babbling[i] = babbling[i].replace("aya", " ");
            babbling[i] = babbling[i].replace("ye", " ");
            babbling[i] = babbling[i].replace("woo", " ");
            babbling[i] = babbling[i].replace("ma", " ");
            babbling[i] = babbling[i].replace(" ", "");

            if (babbling[i].length() == 0)
                answer++;
        }

        return answer;
    }
}