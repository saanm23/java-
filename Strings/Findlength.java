import java.util.*; 

public class Findlength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        String array[] = new String[size];

        int totLength =0;

        //input 
        for(int i=0; i<size; i++) {
        array[i] = sc.next();
        totLength += array[i].length();
        }
        System.out.println(totLength);
    }
}