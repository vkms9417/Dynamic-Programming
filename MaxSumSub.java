import java.util.*;

public class MaxSumSub {

	public static void main(String[] args)
	{
	    Scanner sc=new Scanner(System.in);
	    int[] arr= new int[6];
	     int arr1[]=new int[6];
	    int i,j;
	    for(i=0;i<6;i++){
	        arr[i]=sc.nextInt();
	        arr1[i]=arr[i];
	    }
	    
	    for(i=1;i<6;i++){
	        for(j=i-1;j>=0;j--){
	            if(arr[i]>arr[j] && arr1[i]<(arr1[i]+arr[j])){
	                arr1[i]=arr1[i]+arr[j];
	            }
	        }
	    }
	    
	    int max=arr1[0];
	    
	    for(i=1;i<6;i++){
	        if(arr1[i]>max)
	        max=arr1[i];
	    }
	    
	    System.out.println(max);
 
	}

}
