package Programmers_JuJu.lv_one;

/*
 *   -- 문제설명
 *
 *   대문자와 소문자가 섞여있는 문자열 s가 주어집니다. s에 'p'의 개수와 'y'의 개수를 비교해 같으면 True, 다르면 False를 return 하는 solution를 완성하세요.
 *   'p', 'y' 모두 하나도 없는 경우는 항상 True를 리턴합니다. 단, 개수를 비교할 때 대문자와 소문자는 구별하지 않습니다.
 *   예를 들어 s가 "pPoooyY"면 true를 return하고 "Pyy"라면 false를 return합니다.
 *
 *   -- 제한사항
 *
 *   문자열 s의 길이 : 50 이하의 자연수
 *   문자열 s는 알파벳으로만 이루어져 있습니다.
 *
 * */

public class Seven {
    public static void main(String[] args){
        System.out.println(solution("pPoooyY"));
        System.out.println(solution("fdsjkafhaksj"));
        System.out.println(solution("Pphjhg"));
    }

    public static boolean solution(String s) {
        String lowerStr = s.toLowerCase();
        
        //pnum과 ynum 을 변수 1개로 해서 각자 ++ 이 아닌 p는 ++, y는 -- 식으로 해서 0이면 true, 아니면 false로 흘러가도 된당
        
        int pnum = 0;
        int ynum = 0;

        if(lowerStr.indexOf('p') == -1 && lowerStr.indexOf('y') == -1)
            return true;

        String tmp = lowerStr;
        while(tmp.length() > 0){
            if(tmp.indexOf('p') != -1){
                pnum++;
                if(tmp.indexOf('p')+1 >= tmp.length())
                    break;
                else
                    tmp = tmp.substring(tmp.indexOf('p')+1);
            }else
                break;
        }

        String tmp2 = lowerStr;
        while(tmp2.length() > 0){
            if(tmp2.indexOf('y') != -1){
                ynum++;
                if(tmp2.indexOf('y')+1 >= tmp2.length())
                    break;
                else
                    tmp2 = tmp2.substring(tmp2.indexOf('y')+1);
            }else
                break;
        }

        if(pnum == ynum)
            return true;
        else
            return false;
    }

    public static boolean bestSolution(String s){
        s = s.toUpperCase();
        return s.chars().filter( e -> 'P'== e).count() == s.chars().filter( e -> 'Y'== e).count();

        // return s.replaceAll("[^yY]", "").length() - s.replaceAll("[^pP]", "").length() == 0 ? true : false;
    }
}