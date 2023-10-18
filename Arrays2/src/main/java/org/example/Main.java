package org.example;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // declare and initialize 1 dimensional arrays
        int [] my_Array = {25, 14, 56, 15,34};

        // 1===== traversal ...printing
        System.out.println ("Original array");
        for (int num: my_Array)
        {System.out.print(num +", ");}
        System.out.println();

        //2 ===== update element 56 with 65
        my_Array[2] =65;
        System.out.println ("Array after update:");
        // method toString()
        System.out.println (Arrays.toString(my_Array));

        //3 ====== insertion of a value
        //declaration
        int newValue =45;
        int index_pos =3;
        //shift the elements downwards
        for (int i =my_Array.length-1; i>index_pos; i--)
        {my_Array[i] = my_Array[i-1];}
        my_Array[index_pos]=newValue;
        System.out.println ("Array after insertion: ");
        System.out.println (Arrays.toString(my_Array));

        //4===== deletion of an element
        // Remove an element of the array
        int removeIndex = 2;
        //push array elements from position 1 upwards
        for(int i = removeIndex; i < my_Array.length -1; i++){
            my_Array[i] = my_Array[i + 1];
        }
        System.out.println ("Array after deletion: ");
        System.out.println (Arrays.toString(my_Array));


    }
}