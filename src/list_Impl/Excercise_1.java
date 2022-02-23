package list_Impl;
//Exercise 1. Write a Java program to remove the third element from a array list.
import java.util.*;
public class Excercise_1 {
public static void main(String[] args) {
List<String> list_Strings = new ArrayList<String>();
list_Strings.add("Tushar");
list_Strings.add("Ajit");
list_Strings.add("Mayur");
list_Strings.add("Rahul");
list_Strings.add("Suraj");
System.out.println(list_Strings);
list_Strings.remove(2);
System.out.println("After removing third element from the list:\n"+list_Strings);
}
}

