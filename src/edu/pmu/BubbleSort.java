package edu.pmu;

import java.util.Scanner;
import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);
        System.out.println("Please enter the size of your array");
        int size=input.nextInt();
        int arr[]= new int[size];
        System.out.println("Please enter elements to your array");
        for(int i=0; i<arr.length;i++){
            arr[i]= input.nextInt();
        }
        System.out.printf("Array before sorting: %s%n", Arrays.toString(arr));
        BubbleSort(arr);
        System.out.printf("Array after sorting: %s%n", Arrays.toString(arr));
    }

    static void BubbleSort(int arr[]){
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
    }
}
