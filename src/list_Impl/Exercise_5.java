package list_Impl;

//Write a Java program to insert elements into the linked list at the first and last position. Insert color "Pink" at first and "Blue" at last position in linked list in exercise 4

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Exercise_5 {
public static void main(String[] args) {
    
    List colour = new LinkedList();
    colour.add("Red");
    colour.add("Green");
    colour.add("Black");
    colour.add("White");
    colour.add("Pink");
    
    System.out.println("Display all elements");
    Iterator listItr = colour.iterator();
    while (listItr.hasNext()){
        System.out.println(listItr.next());
    }
    
    //c. insert the specified element at the front of a linked list
    colour.add(0,"Pink");
    colour.add(4,"Blue");
    
    
    //display
    System.out.println("\n");
    System.out.println("Display after enter \"pink\blue\"");
    listItr = colour.iterator();
    while (listItr.hasNext()){
        System.out.println(listItr.next());
    }

    //d. remove a specified element from a linked list
    colour.remove("White");
    
    //display
    System.out.println("\n");
    System.out.println("Display after remove \"white\"");
    listItr = colour.iterator();
    while (listItr.hasNext()){
        System.out.println(listItr.next());
    }
}
}
