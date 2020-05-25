package cn.is04chlk;

import java.util.Scanner;

/**
 * @描述：
 * @作者: 程靓坤
 * @日期: 2020/5/2/002.
 */
public class PwdOK {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            String str=sc.nextLine();
            if(isok(str))
                System.out.println("OK");
            else
                System.out.println("NG");
        }

    }
    public static boolean isok(String str){
        int[] style=new int[4];
        if(str.length()<9)
            return false;
        else {
            for(int i=0;i<str.length();i++){
                if(str.charAt(i)>='a' && str.charAt(i)<='z')
                    style[0]=1;
                else if(str.charAt(i)>='A' && str.charAt(i)<='Z')
                    style[1]=1;
                else if(str.charAt(i)>='0' && str.charAt(i)<='9')
                    style[2]=1;
                else
                    style[3]=1;
            }
            int styn=style[0]+style[1]+style[2]+style[3];
            if(styn<3)
                return false;
            for(int i=0;i<str.length()-3;i++){
                String mid=str.substring(i,i+3);
                if(str.substring(i+3).indexOf(mid)!=-1)
                    return false;
            }
            return true;
        }
    }
}
