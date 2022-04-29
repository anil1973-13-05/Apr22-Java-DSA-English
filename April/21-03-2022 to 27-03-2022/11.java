import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int hours = sc.nextInt();
        if(hours<12){
            System.out.print("good morning");
        }
        else if(hours>=12 && hours<=16){
            System.out.print("good afternoon");
        }
         else if(hours>16 && hours<=20){
            System.out.print("good evening");
        }
         else if(hours>20 && hours<=24){
            System.out.print("good night");
        }
         else {
            System.out.print("invalid input");
        }
    
    }
}