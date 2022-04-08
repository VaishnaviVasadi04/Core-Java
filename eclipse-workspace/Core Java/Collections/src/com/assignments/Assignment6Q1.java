package com.assignments;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Assignment6Q1 {

    public static void main(String a[]){
        TreeMap<String, String> treeMap = new TreeMap<String, String>();
        //add key-value pair to TreeMap
        treeMap.put("first", "FIRST INSERTED");
        treeMap.put("second", "SECOND INSERTED");
        treeMap.put("third","THIRD INSERTED");
        System.out.println(treeMap);
        Map<String, String> map = treeMap.descendingMap();
        System.out.println("Reverse Map Content: ");
        System.out.println(map);

        Set<String> keys = treeMap.keySet();
        for(String key: keys){
            System.out.println(key);


            Collection values = treeMap. values();
            System.out.println("All the values of TreeMap....");
        }
    }
}