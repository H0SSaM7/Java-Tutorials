package arrays_and_function;

import java.util.ArrayList;

public class array_list {
   

    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<String>();
        
  /// add new elemnt
        array.add("hossam");
        array.add("hello world");
        array.add("hello world");
        array.add(0,"Ramadan");
 /// delete new element
        array.remove("hossam");
        array.remove(0);
 /// set elemnt into array
        array.set(0, "hello");
// 
array.isEmpty();
array.contains("hossam");
array.get(0);
array.forEach((elemnt) ->
    System.out.println(elemnt)
);

}}
