package cn.is04chlk;

import java.util.Scanner;

/**
 * @描述：
 * @作者: 程靓坤
 * @日期: 2020/5/1/001.
 */
public class SecretCode {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            String str=sc.nextLine();
            String res="";
            for(int i=0;i<str.length();i++){
                char s=str.charAt(i);
                if(s>='A' && s<'Z'){
                    int t=s-'A'+1;
                    char tt=(char)('a'+t);
                    res=res+tt;
                }
                else if(s=='Z')
                    res=res+'a';
                else if(s>='a' && s<='c')
                    res=res+'2';
                else if(s>='d' && s<='f')
                    res=res+'3';
                else if(s>='g' && s<='i')
                    res=res+'4';
                else if(s>='j' &&
                        s<='l')
                    res=res+'5';
                else if(s>='m' && s<='o')
                    res=res+'6';
                else if(s>='p' && s<='s')
                    res=res+'7';
                else if(s>='t' && s<='v')
                    res=res+'8';
                else if(s>='w' && s<='z')
                    res=res+'9';
                else
                    res=res+s;
            }
            System.out.println(res);
        }
    }
}
