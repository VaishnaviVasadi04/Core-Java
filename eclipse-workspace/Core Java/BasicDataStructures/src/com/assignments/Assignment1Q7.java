package com.assignments;

class Search {
    public static boolean Search(int[] arr, int valuetosearch) {
        boolean t = false;
        for(int i: arr) {
            if (i==valuetosearch) {
                t = true;
                break;
            }
        }
        return t;
    }

}

public class Assignment1Q7 {
    public static void main(String[] args) {
        int arr[] = {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
        int valuetosearch = 19;
        System.out.println(Search.Search(arr,valuetosearch));
    }
}