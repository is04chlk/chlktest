package cn.is04chlk;

import java.util.Scanner;

/**
 * @描述：
 * @作者: 程靓坤
 * @日期: 2020/4/30/030.
 */
public class Count1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            String str=sc.nextLine();
            int len=str.length();
            int re=0;
            int[] dp=new int[len];
            if(str.charAt(0)=='1')
                dp[0]=1;
            for(int i=1;i<len;i++){
                if(str.charAt(i)=='1'){
                    dp[i]=dp[i-1]+1;
                }
                re=Math.max(dp[i],re);
            }
            System.out.println(re);
        }
    }
}
