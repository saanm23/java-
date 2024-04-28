import java.util.*;
 
public class Comparestring {
    public static void main(String[] args) {
        String name1 = "Captain";
        String name2 = "Captain";

        //if s1>s2 = +ve value
        //if s1=s2 = 0
        //if s1<s2 = -ve value

        if (name1.compareTo(name2) == 0)  {
            System.out.println("Strings are equal"); 
        } else {
            System.out.println("Not equal");
        }
        String sentence = "My name is Cap marvel";
        String name = sentence.substring(8);
        System.out.println(name);

        //String are Immutable
    }
}