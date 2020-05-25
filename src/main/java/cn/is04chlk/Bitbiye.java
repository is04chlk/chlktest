package cn.is04chlk;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 * @描述：
 * @作者: 程靓坤
 * @日期: 2020/5/3/003.
 */
public class Bitbiye {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = "";
        while ((line = br.readLine()) != null) {
            int n1=Integer.parseInt(line);
            String s1=Integer.toBinaryString(n1);
            int[] dp=new int[s1.length()];
            if(s1.charAt(0)=='1')
                dp[0]=1;
            else
                dp[0]=0;
            int max=dp[0];
            for(int i=1;i<s1.length();i++){
                if(s1.charAt(i)=='1')
                    dp[i]=dp[i-1]+1;
                else
                    dp[i]=0;
                max=Math.max(max,dp[i]);
            }
            System.out.println(max);
        }
    }
}
