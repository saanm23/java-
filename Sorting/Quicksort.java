import java.util.*;

public class Quicksort {
    public static void printArray(int arr[]) {
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+ " ");
        } 
        System.out.println();

    }
public static void main(String[] args) {
    int arr[] = {4,6,1,8,7,3};
    for(int i=0; i<arr.length; i++) {
        int smallest = i;
        for(int j=i+1; j<arr.length; j++) {
            if(arr[smallest] > arr[j]) {
                smallest =j;
            }
        }
        int temp = arr[smallest];
        arr[smallest] = arr[i];
        arr[i] = temp;

    }
    printArray(arr);
}    
}