package cn.is04chlk;

import java.util.Scanner;

/**
 * @描述：
 * @作者: 程靓坤
 * @日期: 2020/5/3/003.
 */
public class BigCount {
    public static void main(String[] argss){
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            String res=sc.nextLine();
            System.out.println(CalcCapital(res));
        }
    }
    public static int CalcCapital(String str){
        int count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)>='A' && str.charAt(i)<='Z')
                count++;
        }
        return count;
    }
}
