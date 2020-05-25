package cn.is04chlk;

import java.util.*;

/**
 * @描述：
 * @作者: 程靓坤
 * @日期: 2020/5/1/001.
 */
public class MinStr {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            String str=sc.nextLine();
            TreeMap<Character, Integer> tm=new TreeMap<Character, Integer>();
            for(int i=0;i<str.length();i++){
                char a=str.charAt(i);
                if(tm.containsKey(a))
                    tm.put(a,tm.get(a)+1);
                else
                    tm.put(a,1);
            }
            String res="";
            int min=tm.get(tm.firstKey());
            Set<Character> key=tm.keySet();
            for(Character ch:key){
                if(min>tm.get(ch))
                    min=tm.get(ch);
            }
            for(int i=0;i<str.length();i++){
                if(tm.get(str.charAt(i))>min)
                    res=res+str.charAt(i);
            }
            if(res.length()==0)
                res=str;
            System.out.println(res);
        }
    }
}
