package com.project.application.KT.coreJava.collectionPack.sets;

import java.util.Iterator;
import java.util.LinkedHashSet;

/**
 * Created by rajender.koyyeda on 13-04-2022.
 */
public class LinkedHashSetCollection {
    public static void main(String args[]) {
        LinkedHashSet<String> set = new LinkedHashSet<String>();
        set.add("Ravi");
        set.add("Vijay");
        set.add("Ravi");
        set.add("Ajay");
        Iterator<String> itr = set.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
