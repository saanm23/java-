import java.util.*;

public class Basics {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);

        //chara at indoex 0
        System.out.println(sb.charAt(0));

        //Set char at index 0
        sb.setCharAt(0, 'p');    // ' ' == char; " " == String *vimp*
        System.out.println(sb);

        sb.insert(0, 'p');
        System.out.println(sb);

        sb.delete(0, 1);
        System.out.println(sb);

        sb.append('y');
        System.out.println(sb);
        System.out.println(sb.length());


      
    }
}