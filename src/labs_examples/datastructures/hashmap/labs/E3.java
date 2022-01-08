package labs_examples.datastructures.hashmap.labs;

import java.util.*;

public class E3 {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        Stack<Integer> s = new Stack<>();
        PriorityQueue<Integer> q = new PriorityQueue<>();
        HashMap<Integer, Integer> hm = new HashMap<>();

        long llTotalTime = 0;
        long sTotalTime = 0;
        long qTotalTime = 0;
        long hmTotalTime = 0;

        long startTime = 0;
        long endTime = 0;

        //LINKED LIST - #1
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 100; i++) {
            ll.add(i);
        }
        endTime = System.currentTimeMillis();
        long timeLL1 = endTime - startTime;
        llTotalTime += timeLL1;


        //STACK - #1
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 100; i++) {
            s.add(i);
        }
        endTime = System.currentTimeMillis();
        long timeS1 = endTime - startTime;
        sTotalTime += timeS1;


        //QUEUE - #1
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 100; i++) {
            q.add(i);
        }
        endTime = System.currentTimeMillis();
        long timeQ1 = endTime - startTime;
        qTotalTime += timeQ1;


        //HASHMAP - #1
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 100; i++) {
            hm.put(i, i);
        }
        endTime = System.currentTimeMillis();
        long timeHM1 = endTime - startTime;
        hmTotalTime += timeHM1;

        //PRINT OUT INDIVIDUAL TIMES OF #1
        System.out.println("LINKED LIST #1: " + timeLL1);
        System.out.println("STACK #1: " + timeS1);
        System.out.println("QUEUE #1: " + timeQ1);
        System.out.println("HASHMAP #1: " + timeHM1);
        System.out.println();


        //LINKED LIST #2
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 100; i++) {
            ll.set(i, i+10);
        }
        endTime = System.currentTimeMillis();
        long timeLL2 = endTime - startTime;
        llTotalTime += timeLL2;


        //STACK #2
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 100; i++) {
            s.set(i, i+10);
        }
        endTime = System.currentTimeMillis();
        long timeS2 = endTime - startTime;
        sTotalTime += timeS2;


        //QUEUE #2
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 100; i++) {
            q.remove(i);
            q.add(i+10);
        }
        endTime = System.currentTimeMillis();
        long timeQ2 = endTime - startTime;
        qTotalTime += timeQ2;


        //HASHMAP #2
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 100; i++) {
            hm.replace(i, i +10);
        }
        endTime = System.currentTimeMillis();
        long timeHM2 = endTime - startTime;
        hmTotalTime += timeHM2;


        //PRINT OUT INDIVIDUAL TIMES OF #2
        System.out.println("LINKED LIST #2: " + timeLL2);
        System.out.println("STACK #2: " + timeS2);
        System.out.println("QUEUE #2: " + timeQ2);
        System.out.println("HASHMAP #2: " + timeHM2);
        System.out.println();


        //LINKED LIST #3
        startTime = System.currentTimeMillis();
        for (int i = 99; i >= 0; i--) {
            boolean e = ll.contains(i);
        }
        endTime = System.currentTimeMillis();
        long timeLL3 = endTime - startTime;
        llTotalTime += timeLL3;


        //STACK #3
        startTime = System.currentTimeMillis();
        for (int i = 99; i >= 0; i--) {
            boolean e = s.contains(i);
        }
        endTime = System.currentTimeMillis();
        long timeS3 = endTime - startTime;
        sTotalTime += timeS3;


        //QUEUE #3
        startTime = System.currentTimeMillis();
        for (int i = 99; i >= 0; i--) {
            boolean e = q.contains(i);
        }
        endTime = System.currentTimeMillis();
        long timeQ3 = endTime - startTime;
        qTotalTime += timeQ3;


        //HASHMAP #3
        startTime = System.currentTimeMillis();
        for (int i = 99; i >= 0; i--) {
            boolean e = hm.containsValue(i);
        }
        endTime = System.currentTimeMillis();
        long timeHM3 = endTime - startTime;
        hmTotalTime += timeHM3;


        //PRINT OUT INDIVIDUAL TIMES OF #3
        System.out.println("LINKED LIST #3: " + timeLL3);
        System.out.println("STACK #3: " + timeS3);
        System.out.println("QUEUE #3: " + timeQ3);
        System.out.println("HASHMAP #3: " + timeHM3);
        System.out.println();


        //LINKED LIST #4
        startTime = System.currentTimeMillis();
        ll.clear();
        endTime = System.currentTimeMillis();
        long timeLL4 = endTime - startTime;
        llTotalTime += timeLL4;


        //STACK #4
        startTime = System.currentTimeMillis();
        s.clear();
        endTime = System.currentTimeMillis();
        long timeS4 = endTime - startTime;
        sTotalTime += timeS4;


        //QUEUE #4
        startTime = System.currentTimeMillis();
        q.clear();
        endTime = System.currentTimeMillis();
        long timeQ4 = endTime - startTime;
        qTotalTime += timeQ4;


        //HASHMAP #4
        startTime = System.currentTimeMillis();
        hm.clear();
        endTime = System.currentTimeMillis();
        long timeHM4 = endTime - startTime;
        hmTotalTime += timeHM4;


        //PRINT OUT INDIVIDUAL TIMES OF #4
        System.out.println("LINKED LIST #4: " + timeLL4);
        System.out.println("STACK #4: " + timeS4);
        System.out.println("QUEUE #4: " + timeQ4);
        System.out.println("HASHMAP #4: " + timeHM4);
        System.out.println();


        //PRINT OUT TOTALS FOR EACH DATA STRUCTURE
        System.out.println("******************************************");
        System.out.println();
        System.out.println("LINKED LIST TOTAL TIME: " + llTotalTime);
        System.out.println("STACK TOTAL TIME: " + sTotalTime);
        System.out.println("QUEUE TOTAL TIME: " + qTotalTime);
        System.out.println("HASHMAP TOTAL TIME: " + hmTotalTime);
    }
}
