package Searching_Sorting.Searching;

public class BinarySearch {
        public int binarySearch(int[] arr, int l, int r, int x)
        {
            int flag=1;
            if (r >= l) {
                int mid = l + (r - l) / 2;

                if (arr[mid] == x) {
                    flag=0;
                }
                else if (arr[mid] > x) {
                    return binarySearch(arr, l, mid - 1, x);
                }
                else {
                    return binarySearch(arr, mid + 1, r, x);
                }
            }
            if(flag==0){
                System.out.println("Element is found");
            }
            else{
                System.out.println("Element is not found");
                return 0;
            }

            return -1;
        }

}
