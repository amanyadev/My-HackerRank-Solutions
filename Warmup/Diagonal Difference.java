import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[][] = new int[n][n];

          for(int a_i=0; a_i < n; a_i++){
            for(int a_j=0; a_j < n; a_j++){
                a[a_i][a_j] = in.nextInt();
            }
           
          }int s1=0,s2=0,d=0;
        
        for(int i=0;i<n;i++)
        s1=s1+a[i][i];
 
                int x=0;
                for(int j=n-1;j>=0;j--)
                {s2=s2+a[x][j];
                x++;
                }
        d=Math.abs(s1-s2);
        System.out.println(d);
    }
}
