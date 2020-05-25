package cn.is04chlk;

import java.util.Scanner;

/**
 * @描述：
 * @作者: 程靓坤
 * @日期: 2020/4/30/030.
 */
public class Count {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            int num;
            String ns=sc.nextLine();
            num=Integer.parseInt(ns);
            String[] str=new String[num];
            int res=0;
            int[][] dp=new int[num][num];
            for(int i=0;i<num;i++)
                str[i]=sc.nextLine();
            for(int i=0;i<num;i++){
                if(str[0].charAt(i)=='1')
                    dp[0][i]=1;

                if(str[i].charAt(0)=='1')
                    dp[i][0]=1;
            }
            for(int i=1;i<num;i++){
                for(int j=1;j<num;j++){
                    if(str[i].charAt(j)=='1'){
                        dp[i][j]=Math.min(dp[i-1][j],Math.min(dp[i][j-1],dp[i-1][j-1]))+1;
                    }
                    res=Math.max(res,dp[i][j]);
                }
            }
            System.out.println(res);
        }
    }
}
