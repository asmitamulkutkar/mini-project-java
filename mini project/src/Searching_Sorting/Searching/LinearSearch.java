package Searching_Sorting.Searching;

public class LinearSearch {
        public void search(int[] arr, int n, int x) {
            int flag = 0;
            for (int i = 0; i < n; i++) {

                if (arr[i] == x) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 1) {
                System.out.println("Element found");
            }else{
                System.out.println("ELEMENT NOT FOUND");
            }

            // return -1;
        }

    }
