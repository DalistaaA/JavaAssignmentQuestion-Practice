package assign_quiz01;

import java.util.Arrays;
import java.util.Collections;

public class Q1_method3 {

	/*function reverses the elements of the array*/
    static void reverse(Integer a[]) 
    { 
        Collections.reverse(Arrays.asList(a)); 
        System.out.println(Arrays.asList(a)); 
    } 
  
    public static void main(String[] args) 
    { 
        Integer [] arr = {10, 20, 30, 40, 50}; 
        reverse(arr); 
    } 
}
