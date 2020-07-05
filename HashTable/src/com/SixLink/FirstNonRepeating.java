package com.SixLink;


import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeating {
    Map<Character, Integer> map = new HashMap<>();
    public Character FirstNonRepeat(String input){
//        int i = 0;
//        for (Character items:input.toCharArray()){
//            map.put(i, items);
//            i++;
//        }
//        int count = 0;
        var items = input.toCharArray();
        for (var item : items){
            if (map.containsKey(item)){
                map.put(item, map.get(item)+1);
            }else{
                map.put(item,1);
            }
        }
        for (var item:items){
            if (map.get(item) == 1)
                return item;
        }

        return Character.MIN_VALUE;
    }
}
