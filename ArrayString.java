// find the index of String in the given  array

import java.util.Arrays;

class ArrayString {
    public static int linearSearch(String[] arr, String key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(key)) {                
		 return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        
        String[] words = {"apple", "banana", "cherry", "date", "elderberry"};

       
        String key = "cherry";

      
              
        int index = linearSearch(words, key);

        if (index == -1) {
            System.out.println("String not found");
        } else {
            System.out.println("key is at index :"+ index);
        }
    }
}
