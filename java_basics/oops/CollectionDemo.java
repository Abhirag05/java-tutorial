package oops;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
//import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
//Collection is an interface in Java that is part of the Java Collections Framework. It is the root interface for all collection classes in Java, such as List, Set, and Queue. The Collection interface defines a set of methods that can be used to manipulate collections of objects, such as adding, removing, and iterating over elements.
//Collections are used to store and manipulate groups of objects in a more efficient and organized way. They provide a way to group related objects together and perform operations on them as a single unit. Collections can be used to store any type of object, including user-defined classes, and they provide a variety of methods for searching, sorting, and filtering the elements in the collection.
//Collection api is the concept holding everything in a single place. 
public class CollectionDemo {
    public static void main(String[] args) {
      //  Collection <Integer> nums = new ArrayList <Integer>();//Here we are creating a collection of integers using the ArrayList class, which is a concrete implementation of the Collection interface. The ArrayList class provides a dynamic array that can grow or shrink in size as needed. We are using the Integer wrapper class to store integer values in the collection, as the Collection interface can only hold objects and not primitive data types like int.
      List <Integer> nums = new ArrayList <>();//instead of the collection which is broad we can use the list which is more specific and it is an interface that extends the Collection interface and provides additional methods for working with ordered collections of elements. The List interface defines a set of methods that allow us to add, remove, and access elements in a specific order, as well as search for elements based on their position in the list. The ArrayList class is a concrete implementation of the List interface that provides a dynamic array that can grow or shrink in size as needed.
        nums.add(1);
        nums.add(2);
        nums.add(0);
        System.out.println("Array List: " + nums);
        Collections.sort(nums);//sorts the list in ascending order. The Collections class is a utility class that provides static methods for working with collections, including sorting, searching, and manipulating elements in a collection. The sort() method takes a List as an argument and sorts the elements in the list based on their natural ordering or a custom comparator.
        System.out.println("Sorted Array List: " + nums);

        Set <Integer> set_nums=new HashSet<>();
        set_nums.add(1);
        set_nums.add(100);
        set_nums.add(5);
        set_nums.add(2);
        set_nums.add(7);
        set_nums.add(1);
        System.out.println("Hash set:"+set_nums);

        Set <Integer> tree_set_nums=new TreeSet<>();//sorts internally since it extends the SortedSet interface which is a subinterface of the Set interface. It provides a way to store elements in a sorted order based on their natural ordering or a custom comparator. The TreeSet class uses a red-black tree data structure to maintain the order of the elements, which allows for efficient searching, insertion, and deletion of elements.
        tree_set_nums.add(1);
        tree_set_nums.add(100);
        tree_set_nums.add(5);
        tree_set_nums.add(2);
        tree_set_nums.add(7);
        tree_set_nums.add(1);
        System.out.println("Tree set:"+tree_set_nums);

        //map is a collection of key-value pairs, where each key is unique and maps to a single value. It is used to store and retrieve data based on a specific key, allowing for efficient lookups and updates. The Map interface provides methods for adding, removing, and accessing key-value pairs, as well as checking for the existence of keys or values in the map. Common implementations of the Map interface include HashMap, TreeMap, and LinkedHashMap.

        Map<String,Integer> students =new HashMap<>();
        students.put("John", 85);
        students.put("Alice", 92);
        students.put("Bob", 78);
        System.out.println("Students: " + students);
        for (String key:students.keySet()){
            System.out.println("Name: " + key + ", Marks: " + students.get(key));
        }
    }
}
