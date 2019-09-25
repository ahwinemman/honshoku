package com.rukevwe.learn.Basics;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;
import java.util.stream.Collectors;

public class Basic {
    public static void main(String[] args) {
        int a = 20;
        int b = 30;
        int product = b++ * a;
        System.out.println(b);
        System.out.println(product);

        Stack<String> stringStack = new Stack<>();
        stringStack.add("Jack");
        stringStack.push("Jane");
        stringStack.push("Jake");
        String head = stringStack.pop();
        System.out.println(head);
        System.out.println(stringStack);
        boolean match = stringStack.stream().anyMatch(stac -> stac.startsWith("J"));
        long count = stringStack.stream().filter(s -> s.startsWith("J")).count();
        System.out.println(match + "  " + count);

        Queue<String> stringQueue = new LinkedList<>();
        Queue<String> pQueue  = new PriorityQueue<>(); // does not permit null elements;
        pQueue.add(null);
        stringQueue.add("Jack");
        stringQueue.add("Janet");
        stringQueue.remove(); // throws NoSuchElementException when queue is empty
        stringQueue.poll();// throws null if queue is empty
        System.out.println(stringQueue);

//        NoSuchElementException vs EmptyStackException
        
        
        String[] stringArray = new String[2];
        stringArray[0] = "man";
        stringArray[1] = "woman";
        System.out.println(stringArray);

        List<String> stringList = new ArrayList<>();
        stringList.add("man");
        stringList.add("woman");
        System.out.println(stringList);
        stringList.stream().map(str -> str.toLowerCase()).collect(Collectors.toList());

        StringBuffer graphQLStr = new StringBuffer(50);
        graphQLStr.append("{ blacklistStatus( request: {tag: \"").append("red")
                .append("\"}){ responseCode responseDescription agentResponse {tag kitStatus agentStatus} } }");
        System.out.println(graphQLStr);
    }
    
}
