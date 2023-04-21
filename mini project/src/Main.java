import Searching_Sorting.Searching.BinarySearch;
import Searching_Sorting.Searching.LinearSearch;
import Searching_Sorting.Sorting.MergeSort;
import Searching_Sorting.Sorting.QuickSort;
import Searching_Sorting.Sorting.SelectionSort;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array no.s:- ");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        process(arr, n);
    }
    public static void process(int[] arr, int n){
        int ch;
        int m;
        int p;
        Scanner sc=new Scanner(System.in);
            do {
                System.out.print("Enter your choice:\n1.Searching\n2.Sorting\n3.exit");
                 ch=sc.nextInt();
                switch(ch) {
                    case 1:
                        do {
                            System.out.print("Searching Method:\n1.Linear Search\n2.Binary Search\n3.for continue\n4.exit");
                            m = sc.nextInt();
                            switch (m) {
                                case 1:
                                    System.out.println("Enter the searching no: ");
                                    int x = sc.nextInt();
                                    LinearSearch ls = new LinearSearch();
                                    ls.search(arr, n, x);
                                    break;
                                case 2:
                                    System.out.println("Enter the searching no: ");
                                    int y = sc.nextInt();
                                    BinarySearch bs = new BinarySearch();
                                    bs.binarySearch(arr,0,n-1, y);
                                    break;
                                case 3: process(arr,n);
                                    break;
                                case 4:
                                    return;
                            }
                        } while (m != 4);

                    case 2:
                        do {
                            System.out.print("Sorting Method:\n1.Quick Sort\n2.Merge Sort\n3.Selection Sort\n4.for continue\n5.exit");
                            p = sc.nextInt();
                            switch (p) {
                                case 1:
                                    System.out.println("quick sort");
                                    QuickSort qs=new QuickSort();
                                    qs.quickSort(arr,0,n-1);
                                    System.out.println("Sorted Array in Ascending Order: ");
                                    System.out.println(Arrays.toString(arr));
                                    break;
                                case 2:
                                    System.out.println("merge sort");
                                    MergeSort ms =new MergeSort();
                                    ms.sort(arr,0,n-1);
                                    System.out.println("Sorted Array in Ascending Order: ");
                                    System.out.println(Arrays.toString(arr));
                                    break;
                                case 3:
                                    System.out.println("selection sort");
                                    SelectionSort ss=new SelectionSort();
                                    ss.selectionSort(arr);
                                    System.out.println("Sorted Array in Ascending Order: ");
                                    System.out.println(Arrays.toString(arr));
                                    break;
                                case 4:process(arr,n);
                                    break;
                                case 5:
                                    return;
                            }
                        } while (p != 5);


                    case 3:
                        return;
                }
            }while(ch!=3);


    }
}