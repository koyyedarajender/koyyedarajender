package com.project.application.KT.coreJava.collectionPack.list;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * Created by rajender.koyyeda on 13-04-2022.
 */
public class LinkedListCollection {
    public static void main(String args[]) {
        LinkedList<String> al = new LinkedList<String>();
        al.add("Ravi");
        al.add("Vijay");
        al.add("Ravi");
        al.add("Ajay");
        Iterator<String> itr = al.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
