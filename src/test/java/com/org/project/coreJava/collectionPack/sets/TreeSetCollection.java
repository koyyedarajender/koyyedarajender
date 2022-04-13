package com.org.project.coreJava.collectionPack.sets;

import java.util.Iterator;
import java.util.TreeSet;

/**
 * Created by rajender.koyyeda on 13-04-2022.
 */
public class TreeSetCollection {
    public static void main(String args[]){
//Creating and adding elements
        TreeSet<String> set=new TreeSet<String>();
        set.add("Ravi");
        set.add("Vijay");
        set.add("Ravi");
        set.add("Ajay");
//traversing elements
        Iterator<String> itr=set.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
