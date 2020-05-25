package cn.is04chlk;

import java.util.Scanner;
import java.util.Vector;

/**
 * @描述：
 * @作者: 程靓坤
 * @日期: 2020/5/1/001.
 */
public class ZiShouCount {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            int num=sc.nextInt();
            System.out.println(CalcAutomorphicNumbers(num));
        }
    }
    public static int CalcAutomorphicNumbers( int n)
    {
       int res=0;
        Vector<Integer> record=new Vector<Integer>();
       for(int i=1;i<n+1;i++){
           if(i<10){
               if((i*i-i)%10==0) {
                   res = res + 1;
                   record.add(i);
               }
           }
           else if(i>=10 && i<100){
               if((i*i-i)%100==0){
                   res = res + 1;
                   record.add(i);
               }
           }
           else if(i>=100 && i<1000){
               if((i*i-i)%1000==0){
                   res = res + 1;
                   record.add(i);
               }
           }
           else if(i>=1000 && i<10000){
               if((i*i-i)%10000==0){
                   res = res + 1;
                   record.add(i);
               }
           }
           else if(i>=10000 && i<100000){
               if((i*i-i)%100000==0){
                   res = res + 1;
                   record.add(i);
               }
           }
           else if(i>=100000 && i<1000000){
               if((i*i-i)%100000==0){
                   res = res + 1;
                   record.add(i);
               }
           }
       }
       return res+1;
    }
}
