
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0; i<n;i++){
            for(int j=1;j<n-i;j++){
                System.out.print(" ");
            }
            for(int j=0; j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n-1; i>=0;i--){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=0; j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
}
 