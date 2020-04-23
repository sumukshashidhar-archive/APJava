package com.ap;

class mergesort {


    // helper methods

    private static void printArray(int[] array) {

        for(int i: array) {
            System.out.println(i + " ");
        }
        System.out.println();
    }


    private static int[] mergeSort(int[] array) {
        if(array.length <= 1) {
            return array;
            // this is the escape sequence for the recursive method
        }


        // making the midpoint pointer
        int midpoint = array.length / 2;


        // initializing the two arrays
        int[] left = new int[midpoint];
//        int[] right = new int[midpoint];
        int[] right;


        // basically, we try to check what kind of array to assign
        if(array.length % 2 == 0) {
            right = new int[midpoint];
        }
        else {
            right = new int[midpoint + 1];
        }


        // to populate the left array
        for(int i=0; i < midpoint; i++) {
            left[i] = array[i];
        }


        // to populate the right array
        for(int j=0; j < right.length; j++) {
            right[j] = array[midpoint + j];
        }

        int[] result = new int[array.length];


        // main recursion
        left = mergeSort(left);
        right = mergeSort(right);

        result = merge(left, right);
    }

    private static int[] merge(int[] left, int[] right) {


        int[] result = new int(left.length + right.length);


        int leftPointer, rightPointer, resultPointer;
        leftPointer = resultPointer = rightPointer = 0;

        while(leftPoi)
    }
}
