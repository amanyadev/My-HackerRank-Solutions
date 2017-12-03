import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] s = new int[n];
        for(int s_i=0; s_i < n; s_i++){
            s[s_i] = in.nextInt();
        }
        in.close();
        int l=s[0],h=s[0],lc=0,hc=0;
        for(int i=1;i<s.length;i++)
        {if(s[i]>h)
        {hc++;h=s[i];
        }
         if(s[i]<l)
         {lc++;l=s[i];
         }
       
    }
        System.out.println(hc + " " + lc);
    }
}
