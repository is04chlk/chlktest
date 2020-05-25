package cn.is04chlk.leecode;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @描述：
 * @作者: 程靓坤
 * @日期: 2020/5/25/025.
 */
public class LeetCode146 extends LinkedHashMap<Integer, Integer>{
    private int capacity;

    public LeetCode146(int capacity) {
        super(capacity, 0.75F, true);
        this.capacity = capacity;
    }

/*    public int get(int key) {
        return super.getOrDefault(key, -1);
    }

    public void put(int key, int value) {
        super.put(key, value);
    }*/

    @Override
    protected boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest) {
        return size() > capacity;
    }

    /*protected boolean removeEldestEntry(Map.Entry<Integer, Integer> eldest) {
        return map.size() > capacity;
    }*/
    public static void main(String[] args){
        LeetCode146 cache=new LeetCode146(2);
        LinkedHashMap st;
        st=new LinkedHashMap(2,0.75F,true);

        cache.put(1, 1);
        cache.put(2, 2);
        System.out.println(cache.get(1));       // 返回  1
        cache.put(3, 3);    // 该操作会使得密钥 2 作废
        System.out.println(cache.get(2));       // 返回 -1 (未找到)
        cache.put(4, 4);    // 该操作会使得密钥 1 作废
        System.out.println(cache.get(1));       // 返回 -1 (未找到)
        System.out.println(cache.get(2));
        System.out.println(cache.get(3));       // 返回  3
        System.out.println(cache.get(4));       // 返回  4

        st.put(1,1);
        st.put(2,2);
        System.out.println(st.get(1));
        st.put(3,3);
        System.out.println(st.get(2));
        st.put(4,4);
        System.out.println(st.get(1));
        System.out.println(st.get(3));
        System.out.println(st.get(4));
        System.out.println(st.get(2));
        System.out.println("chlk");

        /*LinkedHashMap st=new LinkedHashMap(2,0.75F,true);
        st.put(1,1);
        st.put(2,2);
        System.out.println(st.get(1));
        st.put(3,3);
        System.out.println(st.get(2));
        st.put(4,4);
        System.out.println(st.get(1));
        System.out.println(st.get(3));
        System.out.println(st.get(4));*/
    }
}
