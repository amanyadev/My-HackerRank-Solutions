import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int t = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int m = in.nextInt();
        int n = in.nextInt();
        int app=0,ora=0;
        int[] apple = new int[m];
        for(int apple_i=0; apple_i < m; apple_i++){
            apple[apple_i] = in.nextInt();
        }
        int[] orange = new int[n];
        for(int orange_i=0; orange_i < n; orange_i++){
            orange[orange_i] = in.nextInt();
        }
        
        for(int i=0;i<m;i++)
        {  int drop=a+apple[i];
            if(drop>=s&&drop<=t)
                app++;
         
         }
        for(int i=0;i<n;i++)
        {int drop=b+orange[i];
         if(drop>=s&&drop<=t)
             ora++;
        }
        System.out.println(app+ "\n" + ora);
            
        }
    }

