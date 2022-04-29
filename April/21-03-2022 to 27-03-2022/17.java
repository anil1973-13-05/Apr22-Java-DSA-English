import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i=0;i<num;i++){
            int num1 = sc.nextInt();
            int num2 = sc.nextInt();
            if(i%2==0){
                System.out.println(num1+num2);
            }
            else {
                                System.out.println(num1*num2);

            }
        }
    }
}