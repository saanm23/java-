import java.util.*;

//TimeComplexity 
// outer loop = n times, Inner loop = n times 
// therefore it is n2 (n square)

public class Bubblesort {
    public static void printArray(int arr[]) {
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+ " ");
        } 
        System.out.println();

    }

    public static void main(String args[]) {
        int arr[] = {1,4,8,7,3,2};

        //Bubble Sort
        for(int i=0; i<arr.length-1; i++) {
            for(int j=0; j<arr.length-i-1; j++) {
                if(arr[j] > arr[j+1]) {
                //Swap 
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
                }

            }
        }
        printArray(arr);
    }
}
    
