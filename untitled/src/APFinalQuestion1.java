// 840W008Y
// S.S

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Trial
{

    public int getTrialNum()
    {
        //returns trial number
        return 2;
    }

    public double getTemp()
    {
        //returns temp
        return 100.2;
    }

    public String getCompound()
    {
        //returns name of the compound
        return("Alkyne");
    }
}


public class ScienceExperiment
{
    private ArrayList<Trial> trialList;


    public double getCompoundAvg(String comp)
    {
        double sum = 0;
        int count = 0;
        double average = 0.0;
        boolean isPresent = false;
        //a string is passed in
        for(int i=0; i< trialList.size(); i++ ){
            if(trialList.get(i).getCompound().equals(comp)) {
                isPresent = true;
                sum = sum + trialList.get(i).getTemp();
                count ++;
            }
        }
        if(!isPresent) {
            return(-1.0);
        }
        average = sum/count;
        return average;
    }

    public ArrayList<String> getCompoundList()
    {
        ArrayList<String> test = new ArrayList<String>();
        test.add("aldehyde");
        test.add("kethone=");
        return test;
    }

    public String getCompoundWithHighestAvg()
    {
        // first get the list from the getCompoundList method
        ArrayList<String> compounds = getCompoundList();

        double maxAverage = 0.0;
        String maxAvgString = "";
        for(int i=0; i < compounds.size(); i++) {
            String curCompound = compounds.get(i);
            double testAverage = getCompoundAvg(curCompound);
            if(testAverage > maxAverage) {
                maxAverage = testAverage;
                maxAvgString = curCompound;
            }
        }

        return maxAvgString;
    }
}



/*
* c)
*
* The method header would be
*
* public double getCompoundUsed(String compoundName)
*
*
* In order to implement the getCompoundUsed, we would have to track amount of compound used
* as a variable, hence
*
* private double CompoundUsed
*
* would have to be specified as part of the Trial Class as a private variable
* The constructor of the trial class would have to be changed, in order to include this variable as
* part of the trial object
*
*
* Then, in the science experiment class's getCompoundUsed method it is possible to loop through all the trials
* of a particular compound. Some code from the getCompoundAvg method can be used to loop through
* specific elements.
*
* so a new variable
*
* double totalCompoundUsed
*
* will be in the ScienceExperiment class's getCompound used method, and will be returned from the method
*
* for each trial of the compound, it will take the amount used in that trial, and then add it to the total
*
*
*
*
*
* */