package com.company;


import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
/*
        MyList<Integer> list = new MyList<Integer>();
        list.add(111);
        list.add(211);
        list.add(311);
        list.add(411);
        list.add(511);
        list.add(611);
        list.add(711);
        list.add(811);

        for (Integer item: list.getAll()) {
            System.out.print(item);
        }

        for (Integer i = 0; i < list.length; i++)
        {
            System.out.print(list.get(i));
        }*/
/*
        MyStack<Integer> stack = new MyStack<Integer>();
        stack.push(1101);
        stack.push(1102);
        stack.push(1103);
        stack.push(1104);
        stack.push(1106);
        stack.push(1107);

        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }*/

        MyQueue<Integer> queue = new MyQueue<Integer>();
        queue.add(1001);
        queue.add(1002);
        queue.add(1003);
        queue.add(1004);
        queue.add(1005);
        queue.add(1006);

        while (queue.peek()!=null){
            System.out.println(queue.poll());
        }

        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "Sherali");
        map.put(2, "Begzod");
        map.put(3, "Ganijon");
        map.put(3, "Ganijon1");

        Set set1 = map.entrySet();
        Iterator it = set1.iterator();

        while (it.hasNext()){
            Map.Entry mp = (Map.Entry)it.next();
            System.out.println(mp.getKey() + " -> " + mp.getValue());
        }

        System.out.println("TreeMap");

        TreeMap<Integer, Double> tree = new TreeMap<Integer, Double>();
        tree.put(1,1001.34);
        tree.put(5,5001.34);
        tree.put(4,4001.34);
        tree.put(6,6001.34);
        tree.put(2,2001.34);

        it = tree.entrySet().iterator();
        while (it.hasNext()){
            Map.Entry mp = (Map.Entry)it.next();
            System.out.println(mp.getKey() + " -> " + mp.getValue());
        }

    }
}




