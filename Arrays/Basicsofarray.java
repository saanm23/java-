import java.util.*;

public class Basicsofarray {

    public static void main(String[] args) {
    //     // int[] marks = new int[3];
    //     // //int marks[] = new int[3];
    //     int marks[] = {67,74,97};
    //     // marks[0] = 67;
    //     // marks[1] = 74;
    //     // marks[2] = 97;

    //     for(int i=0; i<3; i++) {
    //         System.out.println(marks[i]);
    //     }
    // }

     Scanner sc = new Scanner(System.in);
     int size = sc.nextInt();
     int numbers[] = new int[size];

     //input 
     for(int i=0; i<size; i++) {
        numbers[i] = sc.nextInt();
     }

     //output
     for(int i=0; i<size; i++) {
        System.out.println(numbers[i]);
     }

   
}
}

