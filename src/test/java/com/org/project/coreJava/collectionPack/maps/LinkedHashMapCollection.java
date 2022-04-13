package com.org.project.coreJava.collectionPack.maps;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Created by rajender.koyyeda on 13-04-2022.
 */
public class LinkedHashMapCollection {
    public static void main(String args[]){

        LinkedHashMap<Integer,String> hm=new LinkedHashMap<Integer,String>();

        hm.put(100,"Amit");
        hm.put(101,"Vijay");
        hm.put(102,"Rahul");

        for(Map.Entry m:hm.entrySet()){
            System.out.println(m.getKey()+" "+m.getValue());
        }
    }
}
