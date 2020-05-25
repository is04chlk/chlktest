package cn.is04chlk;

import java.util.Scanner;
import java.util.Vector;

/**
 * @描述：
 * @作者: 程靓坤
 * @日期: 2020/5/1/001.
 */
public class StringOrder {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            String str=sc.nextLine();
            int len=str.length();
            Vector<Character> vst=new Vector<Character>();
            for(int i=0;i<26;i++){
                for(int j=0;j<len;j++){
                    if((str.charAt(j)-'a'==i) || str.charAt(j)-'A'==i){
                        vst.add(str.charAt(j));
                    }
                }
            }
            char[] res=str.toCharArray();
            for(int i=0;i<len && vst!=null;i++){
                if((str.charAt(i)>='a' && str.charAt(i)<='z') || (str.charAt(i)>='A' && str.charAt(i)<='Z')){
                    res[i]=vst.firstElement();
                    vst.remove(0);
                }
            }
            System.out.println(String.valueOf(res));
        }
    }
}
