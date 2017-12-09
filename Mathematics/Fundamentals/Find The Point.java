//Find the point Solution

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

//#CODE---------------------------------------------------COMMENTS/DESCRIPTION
public class PointRef {					//Class declaration

    public static void main(String[] args) {		//main method
        int n;						//n is the number of points		
        Scanner sc=new Scanner(System.in);		//scanner class for input
        n=sc.nextInt();
        int[][] p=new int[n][2];			//#points p,q and r ..in 2D space
        int[][] q=new int[n][2];
        int[][] r=new int[n][2];
        int i=0;
        for(i=0;i<n;i++)
        {   p[i][0]=sc.nextInt();			//input the points p and q (x,y)
            p[i][1]=sc.nextInt();
            q[i][0]=sc.nextInt();
            q[i][1]=sc.nextInt();
        }
        sc.close();					//close scanner after input
        for(i=0;i<n;i++)
        {r[i][0]=(q[i][0]-p[i][0])+q[i][0];		//calculate x co-ordinates of r
        
        r[i][1]=(q[i][1]-p[i][1])+q[i][1];		//calculate y co-ordinates of r
        System.out.println(r[i][0]+" "+r[i][1]);	//display the r we calculated
    }							//end of for loop

    }							//end of main
}							//end of program