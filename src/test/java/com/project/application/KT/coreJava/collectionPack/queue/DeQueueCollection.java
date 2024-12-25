package com.project.application.KT.coreJava.collectionPack.queue;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Created by rajender.koyyeda on 13-04-2022.
 */
public class DeQueueCollection {
    public static void main(String[] args) {
//Creating Deque and adding elements
        Deque<String> deque = new ArrayDeque<String>();
        deque.add("Gautam");
        deque.add("Karan");
        deque.add("Ajay");
//Traversing elements
        for (String str : deque) {
            System.out.println(str);
        }
    }
}
