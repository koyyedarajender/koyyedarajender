package com.org.project.coreJava.collectionPack.sets;

import java.util.HashSet;
import java.util.Iterator;

/**
 * Created by rajender.koyyeda on 13-04-2022.
 */
public class HashSetCollection {
    public static void main(String args[]){
//Creating HashSet and adding elements
        HashSet<String> set=new HashSet<String>();
        set.add("Ravi");
        set.add("Vijay");
        set.add("Ravi");
        set.add("Ajay");
//Traversing elements
        Iterator<String> itr=set.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
