import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        if(Character.isLowerCase(ch)){
            System.out.println("Char is Lowercase");
        }
        else if(Character.isUpperCase(ch)){
            System.out.println("Char is Uppercase");
        }
        else{
            System.out.println("Is not a alphabet");
        }
    }
}