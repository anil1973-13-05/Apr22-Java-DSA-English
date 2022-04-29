import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        for(int i=0; i<number; i++){
            for(int j=0; j<number; j++){
                System.out.print("*"+ " ");
            }
            System.out.println();
        }
    }
}