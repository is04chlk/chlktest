package cn.is04chlk.leecode;

import java.util.ArrayList;
import java.util.List;

/**
 * @描述：
 * @作者: 程靓坤
 * @日期: 2020/5/21/021.
 */
public class LeetCode21 {
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        /*if(l1==null)
            return l2;
        if(l2==null)
            return l1;
        if(l1.val<l2.val){
            l1.next=mergeTwoLists(l1.next,l2);
            return l1;
        }
        else {
            l2.next=mergeTwoLists(l1,l2.next);
            return l2;
        }*/
        ListNode dummyHead = new ListNode(0);
        ListNode tail = dummyHead;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                tail.next = l1;
                l1 = l1.next;
            } else {
                tail.next = l2;
                l2 = l2.next;
            }
            tail = tail.next;
        }

        tail.next = l1 == null? l2: l1;

        return dummyHead.next;
    }
    public static ListNode reverseList(ListNode head) {
        List<Integer> st=new ArrayList<>();
        while (head!=null){
            st.add(head.val);
            head=head.next;
        }
        ListNode pre=null;
        ListNode res=new ListNode(0);
        for(int i=0;i<st.size();i++){
            res.val=st.get(i);
            res.next=pre;
            pre=res;
        }
        System.out.println(pre.val);
        return pre;
        /*ListNode pre=null;
        ListNode cur=head;
        while (cur!=null){
            ListNode tmp=cur.next;
            cur.next=pre;
            pre=cur;
            cur=tmp;
        }
        System.out.println(pre.val);*/
       // return pre;
    }
    public static void main(String[] args){
        ListNode a=new ListNode(4);
        ListNode b=new ListNode(2);
        b.next=a;
        ListNode c=new ListNode(1);
        c.next=b;

        ListNode d=new ListNode(4);
        ListNode e=new ListNode(3);
        e.next=d;
        ListNode f=new ListNode(1);
        f.next=e;
   //     ListNode tt=mergeTwoLists(c,f);
        ListNode tt=reverseList(c);
        System.out.println(tt.val);
    }
    public static class ListNode{
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
}

