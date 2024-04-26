package loops;

// public class Invertedhalf180 {

//     public static void main(String[] args) {
//         int n =4;
//         //outer loop
//         for(int i=1; i<=n; i++) {
//             //Inner loop for space print
//             for(int j=1; j<=n-i; j++) {
//                 System.out.print(" ");
//             }
//             //Inner loop for Star print
//             for(int j=1; j<=i; j++) {
//                 System.out.print("*");
//             }
//         } System.out.println();
//     }
// }

public class Invertedhalf180 {
    public static void main(String[] args) {
        
    int n=4;

    for(int i=n; i>=1; i--) {
        for(int j=1; j<i; j++) {
            System.out.print(" ");
        }


        for(int j=0; j<=n-i; j++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
}

