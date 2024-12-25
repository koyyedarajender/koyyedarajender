package com.project.application.KT.coreJava.collectionPack.list;

import java.util.Iterator;
import java.util.Vector;

/**
 * Created by rajender.koyyeda on 13-04-2022.
 */
public class VectorCollection {
    public static void main(String args[]) {
        Vector<String> v = new Vector<String>();
        v.add("Ayush");
        v.add("Amit");
        v.add("Ashish");
        v.add("Garima");
        Iterator<String> itr = v.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
