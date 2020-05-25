package cn.is04chlk;

import java.util.Scanner;

/**
 * @描述：
 * @作者: 程靓坤
 * @日期: 2020/4/26/026.
 */
public class DpTest {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            int num=sc.nextInt();
            int[] arrn=new int[num+1];
            arrn[0]=0;
            for(int i=0;i<num+1;i++){
                if(i==0) arrn[i]=0;
                if(i==1 || i==2 || i==5)
                    arrn[i]=1;
                else if(i>2 && i<5){
                    arrn[i]=Math.min(arrn[i-1],arrn[i-2])+1;
                }
                else if(i>5)
                    arrn[i]=mins(arrn[i-1],arrn[i-2],arrn[i-5])+1;
            }

            System.out.println("min:"+arrn[num]);
        }
    }
    public static int mins(int a, int b, int c){
        int min=a;
        if(a>b)
            min=b;
        if(min>c)
            min=c;
        return min;
    }
}
