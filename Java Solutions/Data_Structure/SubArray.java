package Data_Structure;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SubArray {

    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        int sum=0;
       int n = sc.nextInt();
        int[] a = new int [n];
        
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        
        int c=0;
        for(int i=0; i < n ; i++)
        {  
           for ( int j = i ; j < n ; j++)
           { sum = 0;
               for(int k = i ; k <=j ; k++)
                   sum = sum + a[k];
               if(sum < 0)
                   c++;
           }
        }
        System.out.println(c);
    }
}