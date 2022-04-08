package com.assignments;

class Bubblesort{
    public static int[] bubbleSort(int arr[]) {
        int n = arr.length, i ,j , temp;
        for (i=0; i<n; i++) {
            for (j = i+1; j<n; j++) {
                if (arr[j] < arr[i]) {
                    temp =arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;

                }
            }
        }
        return arr;
    }
    public static void printArray(int arr[])
    {
        int i,size = arr.length;
        for (i=0;i<size;i++)
            System.out.print(arr[i] + " ");
        System.out.println();
    }
}

public class Assignment1Q8 {
    public static void main(String args []) {
        int arr[] = {5,12,14,6,78,19,1,23,26,35,37,7,52,86,57};
        int[] b = Bubblesort.bubbleSort(arr);
        System.out.println("sorted array is : ");
        Bubblesort.printArray(b);
    }
}