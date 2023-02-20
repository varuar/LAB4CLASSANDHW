package com.mycompany.lab4assignment;

public class PART3 {
    
public static int binarySearch(int[] arr, int key) {
    return binarySearchHelper(arr, key, 0, arr.length - 1);
}

private static int binarySearchHelper(int[] arr, int key, int left, int right) {
    // the left index is greater than the right index, the key is not in the array
    if (left > right) {
        return -1;
    }

    // we have to find the middle index of the array
    int mid = (left + right) / 2;

    // the middle element is the key, return its index
    if (arr[mid] == key) {
        return mid;
    }

    //so the key is less than the middle element, search the left half of the array
    if (key < arr[mid]) {
        return binarySearchHelper(arr, key, left, mid - 1);
    }

    // here the  key is greater than the middle element, search the right half of the array
    return binarySearchHelper(arr, key, mid + 1, right);
}
}