import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n<2){System.out.print("Not a Prime"); return;}
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                System.out.println("Not a Prime");
                return;
            }
        }
        System.out.println("Prime");
    }
}