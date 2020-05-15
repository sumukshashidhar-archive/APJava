// 840W008Y
// S.S

import java.util.ArrayList;


public class TargetIntegers
{
    public static int getInt(){

    }

    public static boolean isTarget(int x) {
        return true;
    }

    public static boolean runSimulation(int sampleSize) {
        int midVal = sampleSize/2;
        int totalCounter = 0;
        int firstHalfCounter = 0;
        int secondHalfCounter = 0;
        for(int i=0; i< sampleSize; i++) {
            int testVal = getInt(); //getting the value to test for positive and target
            boolean test = isTarget(testVal); // getting the boolean from target
            if(test && testVal > 0) {
                // this is basically to test if we are checking for the first half of the sample values
                // or the second half, depending on that we increment
                // this eliminates the need for an array, as we can separate the halves while incrementing
                if(totalCounter <= midVal) {

                    // checking if it is the first half of the values
                    firstHalfCounter ++;
                }
                else {
                    //if not first, then second
                    secondHalfCounter++;
                }

            }
            midVal ++; //incrementing midval once an iteration is complete
        }

        if(firstHalfCounter > secondHalfCounter) {
            return true;
        }
        return false;
    }
}


/*
*
* b) This can be achieved by using the final keyword while defining this variable
*
* such as
*
* final int sampleSize = <some value>

* since this is a final variable declared in the scope of the class,
*
* we can modify the runSimulation method to
*
* public static boolean runSimulation()
*
*
* as we can reference the sample size internally from the class
*
*
*
*
* */