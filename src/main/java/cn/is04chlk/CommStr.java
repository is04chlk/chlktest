package cn.is04chlk;

import java.util.Scanner;

/**
 * @描述：
 * @作者: 程靓坤
 * @日期: 2020/4/25/025.
 */
public class CommStr {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            String str1=sc.nextLine();
            String str2=sc.nextLine();
            int len1=str1.length();
            int len2=str2.length();
            String res1=(len1>=len2?str1:str2);
            String res2=(len1>=len2?str2:str1);
            int mlen=res2.length();
            int result=0;
            boolean flag=false;
            do{
                for(int i=0;i<res2.length()-mlen+1;i++){
                    String mid=res2.substring(i,i+mlen);
               //     System.out.println(mid+" : "+res1.indexOf(mid));
                    if(res1.indexOf(mid)>-1){
                        System.out.println(mlen);
                        flag=true;
                        break;

                //        result=mlen;
                    //    flag=true;
                //        break;
                    }
                }
                if(!flag)
                    mlen--;
                if(flag)
                    break;
            } while ((mlen>0));
            if(!flag)
                System.out.println(result);
        }
    }
}
