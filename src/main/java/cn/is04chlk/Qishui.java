package cn.is04chlk;

import java.util.Scanner;

/**
 * @描述：
 * @作者: 程靓坤
 * @日期: 2020/4/24/024.
 */
public class Qishui {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            int num=sc.nextInt();
            if(num==0)
                break;
            int count=0;
            while (num>2){
                count=count+num/3;
                int sy=0;
                sy=num%3+num/3;
                num=sy;
            }
            if(num==2)
                count++;
            System.out.println(count);
        }
    }
}
