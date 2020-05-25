package cn.is04chlk.huawei;

import java.util.*;

/**
 * @描述：
 * @作者: 程靓坤
 * @日期: 2020/5/20/020.
 */
public class Translate {
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            String str1=sc.nextLine();
            String str2=sc.nextLine();
            String res=contact(str1,str2);
            String result="";
            for(char c : res.toCharArray()){
                char t=bitc(c);
                result=result+t;
            }
            System.out.println(res);
            System.out.println(result);
        }
    }
    public static String contact(String str1,String str2){
        String res="";
        Queue<Character> jlist=new PriorityQueue<>();
        Queue<Character> olist=new PriorityQueue<>();
        String str=str1+str2;
        String st1="",st2="";
        int t=0;
        for(char c:str.toCharArray()){
            if(t%2==0)
                st1=st1+c;
            else
                st2=st2+c;
            t++;
        }
        for(int i=0;i<st1.length();i++)
            jlist.add(st1.charAt(i));
        for(int i=0;i<st2.length();i++)
            olist.add(st2.charAt(i));
        while (!jlist.isEmpty() || !olist.isEmpty()){
            if(!jlist.isEmpty()){
                char x=jlist.poll();
                res=res+x;
            }
            if(!olist.isEmpty()){
                char y=olist.poll();
                res=res+y;
            }
        }
        return res;
    }
    public static char bitc(char c){
        if(c=='0')  return '0';
        else if(c=='1') return '8';
        else if(c=='2') return '4';
        else if(c=='3') return 'C';
        else if(c=='4') return '2';
        else if(c=='5') return 'A';
        else if(c=='6') return '6';
        else if(c=='7') return 'E';
        else if(c=='8') return '1';
        else if(c=='9') return '9';
        else if(c=='a' || c=='A') return '5';
        else if(c=='b' || c=='B') return 'D';
        else if(c=='c' || c=='C') return '3';
        else if(c=='d' || c=='D') return 'B';
        else if(c=='e' || c=='E') return '7';
        else if(c=='f' || c=='F') return 'F';
        return c;
    }
}
