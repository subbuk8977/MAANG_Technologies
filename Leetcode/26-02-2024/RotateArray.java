/*
	Left Rotate an Array by One:


	Problem statement
	Given an array 'arr' containing 'n' elements, rotate this array left once and return it.

	Rotating the array left by one means shifting all elements by one place to the left and moving the first element to the last position in the array.
*/



import java.util.* ;
import java.io.*; 


public class Solution {

    static int[] rotateArray(int[] arr, int n) {
        // Write your code here.


        int newarr[]=new int[n];

        for(int i=1;i<n;i++){

            newarr[i-1]=arr[i];
        }

        newarr[n-1]=arr[0];

        return newarr;

    }
}