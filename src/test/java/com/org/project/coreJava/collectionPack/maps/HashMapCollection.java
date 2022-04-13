package com.org.project.coreJava.collectionPack.maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Created by rajender.koyyeda on 13-04-2022.
 */
public class HashMapCollection {
    public static void main(String[] args) {
        Map map=new HashMap();
        //Adding elements to map
        map.put(1,"Amit");
        map.put(5,"Rahul");
        map.put(2,"Jai");
        map.put(1,"Amit");
        map.put(6,"Amit");
        //Traversing Map
        Set set=map.entrySet();//Converting to Set so that we can traverse
        Iterator itr=set.iterator();
        while(itr.hasNext()){
            //Converting to Map.Entry so that we can get key and value separately
            Map.Entry entry=(Map.Entry)itr.next();
            System.out.println(entry.getKey()+" "+entry.getValue());
            System.out.println(entry.getValue());
        }
    }
}
