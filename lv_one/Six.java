package Programmers_JuJu.lv_one;

/*
 *   -- 문제설명
 *
 *   임의의 양의 정수 n에 대해, n이 어떤 양의 정수 x의 제곱인지 아닌지 판단하려 합니다.
 *   n이 양의 정수 x의 제곱이라면 x+1의 제곱을 리턴하고, n이 양의 정수 x의 제곱이 아니라면 -1을 리턴하는 함수를 완성하세요.
 *
 *   -- 제한사항
 *
 *   n은 1이상, 50000000000000 이하인 양의 정수입니다.
 *
 * */

public class Six {
    public static void main(String[] args){
        System.out.println(solution(121));
        System.out.println(bestSolution(3));
    }

    public static long solution(long n) {
        double sqrt = Math.sqrt(n);
        String deci = Double.toString(sqrt).substring(Double.toString(sqrt).indexOf('.')+1);

        if("0".equals(deci))
            return (long) Math.pow((sqrt+1), 2);
        else
            return -1;
    }

    public static long bestSolution(long n){
        if (Math.pow((int)Math.sqrt(n), 2) == n)
            return (long) Math.pow(Math.sqrt(n) + 1, 2);

        return -1;
    }
}
