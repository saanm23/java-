import java.util.*;

import javax.management.openmbean.CompositeDataInvocationHandler; 


public class basics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next(); // nextline for the whole name ex: Captain jack, to include jack in ouput use nextline
        System.out.println("Your name is " + name);

        //Concatenation
        String Firstname = "Captain";
        String Lastname = "Jack";
        String Fullname = Firstname + " " + Lastname;
        System.out.println(Fullname);
        System.out.println(Fullname.length());

        //CharAt
        for(int i=0; i<Fullname.length(); i++) {
            System.out.println(Fullname.charAt(i));
        }
    }

    
}