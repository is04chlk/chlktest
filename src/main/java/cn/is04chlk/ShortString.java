package cn.is04chlk;

import java.util.Scanner;

/**
 * @描述：
 * @作者: 程靓坤
 * @日期: 2020/5/3/003.
 */
public class ShortString {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            String s1=sc.nextLine();
            String s2=sc.nextLine();
            if(boolIsAllCharExist(s1,s2))
                System.out.println("true");
            else
                System.out.println("false");
        }

    }
    public static boolean boolIsAllCharExist(String shorts,String longs){
        boolean isall=true;
        for(int i=0;i<shorts.length();i++){
            if(longs.indexOf(shorts.substring(i,i+1))<0)
                return false;
        }
        return isall;
    }
}
