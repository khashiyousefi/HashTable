package com.SixLink;


import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeating {
    Map<Integer, Character> map = new HashMap<>();
    public Character FirstNonRepeat(String input){
        int i = 0;
        for (Character items:input.toCharArray()){
            map.put(i, items);
            i++;
        }

        for (var item : map.entrySet()){
            Character clear = item.getValue();
            item.setValue(null);
            if (!map.containsValue(clear)){
                return clear;
            }
            item.setValue(clear);
        }
        return null;
    }
}
