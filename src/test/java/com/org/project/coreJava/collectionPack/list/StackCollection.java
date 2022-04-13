package com.org.project.coreJava.collectionPack.list;

import java.util.Iterator;
import java.util.Stack;

/**
 * Created by rajender.koyyeda on 13-04-2022.
 */
public class StackCollection {
    public static void main(String args[]){
        Stack<String> stack = new Stack<String>();
        stack.push("Ayush");
        stack.push("Garvit");
        stack.push("Amit");
        stack.push("Ashish");
        stack.push("Garima");
        stack.pop();
        Iterator<String> itr=stack.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
