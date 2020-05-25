package cn.is04chlk;

import java.util.Scanner;

/**
 * @描述：
 * @作者: 程靓坤
 * @日期: 2020/5/3/003.
 */
public class LongPwd {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            String str1=sc.nextLine();
            System.out.println(leng(str1));
        }
    }
    public static int leng(String str){
        int max=0;
        for(int i=0;i<str.length()-1;i++){
            for (int j=i+1;j<str.length();j++){
                int m=i,n=j;

                boolean isok=true;
                if(i+1==j){
                    if(str.charAt(i)!=str.charAt(j)){
                        isok=false;
                        continue;
                    }
                }
                while (m+1<n){

                    if(str.charAt(m)==str.charAt(n)){
                        m++;
                        n--;
                        continue;
                    }
                    else{
                        isok=false;
                        break;
                    }
                }
                if(isok){
                    max=Math.max(max,j-i+1);
                }
            }
        }
        return max;
    }
}
