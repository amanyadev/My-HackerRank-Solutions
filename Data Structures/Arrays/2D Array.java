import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

//Print Array in Reverse Order 

//CODE----------------------------------------- COMMENTS
public class Solution {				//class declaration
						
    public static void main(String[] args) {   //main function
        Scanner in = new Scanner(System.in);   // Scanner Class for taking input
        int n = in.nextInt(); 		       //n is the size of array
        int arr[] = new int[n];		       //declare the array
        for(int arr_i=0; arr_i < n; arr_i++){  //a loop to enter the elements of array
            arr[arr_i] = in.nextInt(); 	       //scanning the input
        }
        for(int i=n-1;i>=0;i--){	      //loop for reverse order from n-1 to 0 since the index of array is from 0 to n-1
            System.out.print(arr[i]+" ");     //print output
        }        			      //end of for loop
    }					      //end of main
}					     //end of program
