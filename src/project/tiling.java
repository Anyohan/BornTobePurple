package project;
import java.util.*;

//미완성
//dp 로 풀기

public class tiling{
    public static void main(String[] args){
        int mod = 10007;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] dp;
        dp = new int[1001];
        dp[0] = dp[1] = 1;
        for(int i =2;i<dp.length;i++){
            dp[i] = dp[i-2] + dp[i-1];
            dp[i] %= mod;
        }
        System.out.println(dp[n]);
    }
}