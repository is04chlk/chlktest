package cn.is04chlk;

import java.util.Scanner;

/**
 * @描述：
 * @作者: 程靓坤
 * @日期: 2020/5/2/002.
 */
public class EncryCode {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            String str=sc.nextLine();
            String unstr=sc.nextLine();
            System.out.println(encrypt(str));
            System.out.println(unencrypt(unstr));
        }
    }
    public static String encrypt(String str){
        String res="";
        for(int i=0;i<str.length();i++){
            char st=str.charAt(i);
            char md;
            if(st>='a' && st<'z'){
                md= (char) (st-32+1);
            }
            else if(st=='z')
                md='A';
            else if(st>='A' && st<'Z'){
                md= (char) (st+32+1);
            }
            else if(st=='Z')
                md='a';
            else if(st>='0' && st<'9')
                md=(char)(st+1);
            else if(st=='9')
                md='0';
            else
                md=st;
            res=res+md;
        }
        return res;
    }
    public static String unencrypt(String str){
        String res="";
        for(int i=0;i<str.length();i++){
            char st=str.charAt(i);
            char md;
            if(st>='b' && st<='z'){
                md= (char) (st-32-1);
            }
            else if(st=='a')
                md='Z';
            else if(st>='B' && st<='Z'){
                md= (char) (st+32-1);
            }
            else if(st=='A')
                md='z';
            else if(st>'0' && st<='9')
                md=(char)(st-1);
            else if(st=='0')
                md='9';
            else
                md=st;
            res=res+md;
        }
        return res;
    }
}
