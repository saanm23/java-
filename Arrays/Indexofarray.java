import java.util.*;

public class  Indexofarray {

    public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     int size = sc.nextInt();
    //     int numbers[] = new int[size];

    //     //Input
    //     for(int i=0; i<size; i++) {
    //         numbers[i] = sc.nextInt();
    //     }
    //     int x = sc.nextInt();

    //     //Output 
    //     for(int i=0; i<numbers.length; i++) {
    //         if( numbers[i] == x ) {
    //             System.out.println("x found at "+ i);
    //         }
    //     }
    // }

    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    int numbers[] = new int[size];

    //input 
    for(int i=0; i<size; i++) {
       numbers[i] = sc.nextInt();
    }

    int x = sc.nextInt();

    //output
    for(int i=0; i<numbers.length; i++) {
     if( numbers[i] == x ) {
       System.out.println("X is found at index " + i);
    }
}
    
}

}