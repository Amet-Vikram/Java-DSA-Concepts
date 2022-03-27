package com.bridgelabz.dsa.algorithms;

public class BinarySearch {
    static int binarySearch(String[] arr, String x)    {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int res = x.compareTo(arr[mid]);

            if (res == 0) // Check if x is present at mid
                return mid;
            if (res > 0) // If x greater, ignore left half
                left = mid + 1;
            else // If x is smaller, ignore right half
                right = mid - 1;
        }
        return -1;
    }

    public static void main(String []args)
    {
        String[] arr = { "Amet" ,"Amy" ,"Gina" ,"Jake" ,"Payal" ,"Raj" ,"Sreshtha" ,"Terry"};
        String x = "Amy";
        int result = binarySearch(arr, x);

        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at " + "index " + result);
    }
}
