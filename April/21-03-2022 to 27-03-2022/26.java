import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int target = sc.nextInt();
        int k =0;
        for(int i=1; i<n;i++){
            for(int j=i+1; j<=n;j++){
                if(i+j==target){
                    k++;
                }
            }
        }
    System.out.println(k);
    }
}