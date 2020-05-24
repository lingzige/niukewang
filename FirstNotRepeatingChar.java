package niuke;

// 在一个字符串(0<=字符串长度<=10000，全部由字母组成)中找到第一个只出现一次的字符,并返回它的位置,
// 如果没有则返回 -1（需要区分大小写）.（从0开始计数）

import java.util.*;

public class FirstNotRepeatingChar {

    public static void main(String[] args) {
        String str = "google";
        System.out.println(firstNotRepeatingChar(str));
    }

    public static int firstNotRepeatingChar(String str) {
        if(str.length()==0){
            return -1;
        }
        if(str.length()==1){
            return 0;
        }
        LinkedHashMap<Character,Integer> map = new LinkedHashMap<>();
        char[] chs = str.toCharArray();
        for (char ch : chs) {
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }else{
                map.put(ch,1);
            }
        }
        System.out.println(map);
        Set<Map.Entry<Character,Integer>> set = map.entrySet();
        Iterator<Map.Entry<Character, Integer>> iterator = set.iterator();
        while(iterator.hasNext()){
            Map.Entry<Character, Integer> next = iterator.next();
            char key = next.getKey();
            Integer value = next.getValue();
            if(value==1){
                for (int i = 0; i < chs.length; i++) {
                    if(chs[i]==key){
                        return i;
                    }
                }
            }
        }
        return -1;
    }
}
