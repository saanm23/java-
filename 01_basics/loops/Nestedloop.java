package loops;

// public class Nestedloop {

//     public static void main(String[] args) {
//         for(int i =1; i<=4; i++) {
//             for(int j=1 ; j<=5; j++) {
//                 System.out.print("*");
//             }
//             System.out.println(); // this is for next line only
//         }
//     }
// }

public class Nestedloop {

    public static void main(String[] args) {
        int n = 4;
        int m =5;
        for(int i =1; i<=n; i++) {
            for(int j=1 ; j<=m; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}