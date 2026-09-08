import java.util.*;
public class RigthRotateArr
{
	public static void main(String[] args) {
	    int a[]={1,2,3,4,5};
		System.out.println("Original array: "+Arrays.toString(a));
		RightRotate(a);
		System.out.println("Rotated array: "+Arrays.toString(a));
	}
	public static void RightRotate(int[] arr){
	    int last=arr[arr.length-1];
	    for(int i=arr.length-1;i>0;i--){
	        arr[i]=arr[i-1];
	    }
	    arr[0]=last;
	}
}