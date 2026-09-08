import java.util.*;
public class LeftRotateArr
{
	public static void main(String[] args) {
	    int a[]={1,2,3,4,5};
		System.out.println("Original array: "+Arrays.toString(a));
		LeftRotate(a);
		System.out.println("Original array: "+Arrays.toString(a));
	}
	public static void LeftRotate(int[] arr){
	    int first=arr[0];
	    for(int i=0;i<arr.length-1;i++){
	        arr[i]=arr[i+1];
	    }
	    arr[arr.length-1]=first;
	}
}