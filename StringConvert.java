// Convert one string to another using replace, remove and insert

import java.io.*;
import java.util.*;

public class StringConvert {
	

	public static int minOps(String A, String B)
	{
	    int l1=A.length() + 1,i,j;
	    int l2=B.length() + 1;
	    
	    int[][] arr=new int[l1][l2];
	    for(i=0;i<l1;i++){
	        for(j=0;j<l2;j++){
	            
	            //for Null
	            if(i==0){
	                arr[i][j]=j;
	            }
	            
	            // for Null
	            else if(j==0){
	                arr[i][j]=i;
	            }
	            
	            //for same character i.e r==c
	            else if(A.charAt(i-1) == B.charAt(j-1)){
	                    arr[i][j]=arr[i-1][j-1];
	                }
	                
	                // for different character
	                else{
	                    List<Integer> list=Arrays.asList(arr[i][j-1],      //insert
	                                                    arr[i-1][j],      //remove
	                                                    arr[i-1][j-1]);   //replace
	                                                    
	                   arr[i][j]=Collections.min(list) + 1;
	                }
	           }
	     }
	    return arr[l1-1][l2-1];
	}
	public static void main(String[] args)
	{
	    Scanner sc=new Scanner(System.in);
	    
	    String s1=sc.next();
	    String s2=sc.next();
	    
	   System.out.println(minOps(s1,s2));
	}

}

