package org.example;
import java.util.*;

public class Fruits {
    public static void main(String[] args) {
        Map<Integer,String> F = new HashMap<>();
        F.put(1,"apple");
        F.put(2,"orange");
        F.put(3,"pear");
        F.put(4,"pineapple");

     System.out.println(F);

       F.clear();
       System.out.println("Cleared Fruits :");
       System.out.println(F);

    }
}
