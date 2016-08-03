package com.samples;

import java.util.ArrayDeque;

import static java.lang.System.*;

/**
 * Created by Optiplex on 25/07/16.
 */
public class ArrayDeque1 {


    private static void stackSample1() {
        out.println("Stack sample");
        ArrayDeque<Integer> deque = new ArrayDeque();

        deque.push(10);
        deque.push(500);
        deque.push(1000);

        int peekResult = deque.peek();
        out.println(peekResult);

        int popResult = deque.pop();
        out.println(popResult);

        popResult = deque.pop();
        out.println(popResult);

    }

    private static void addsLoops() {
        out.println("addLoops sample");
        ArrayDeque<String> deque = new ArrayDeque();

        deque.add("caterpillar");
        deque.add("dinosaur");
        deque.add("bird");

        deque.forEach(System.out::println);

    }

    private static void isEmptySizeClear() {
        out.println("isEmptySizeClear sample");
        ArrayDeque<Double> doubles = new ArrayDeque<>();

        doubles.push (50.25);
        doubles.push (100.40);
        doubles.push (120.25);
        doubles.push (150.50);

        out.println("isEmpty:" + doubles.isEmpty());
        out.println("size:" + doubles.size());

        doubles.clear();

        out.println("isEmpty:" + doubles.isEmpty());
        out.println("size:" + doubles.size());
    }

    private static void exam1() {
        out.println("exam1");
        ArrayDeque ad = new ArrayDeque();
        ad.add(6);
        out.println("exam1:a:" +ad);
        ad.add(2);
        out.println("exam1:b:" +ad);
        ad.offerLast(3);
        out.println("exam1:c:" +ad);
        ad.offer(4);
        out.println("exam1:d:" +ad);
        ad.poll();
        out.println("exam1:e:" + ad);
        ad.pop();
        out.println("exam1:f:" + ad);
        ad.offerFirst(10);
        out.println("exam1:g:" + ad);
    }

    public static void main(String ... args) {

        stackSample1();

        addsLoops();

        isEmptySizeClear();

        exam1();
    }
}
