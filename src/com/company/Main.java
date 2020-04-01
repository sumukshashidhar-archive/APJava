package com.company;

class StepTracker
{
    private int threshold;
    private int activedays;
    private int averagesteps;
    private int dailysteps;
    private int totalsteps;
    private int totaldays;
    public StepTracker(int num_steps)
    {
        threshold = num_steps;
        activedays = 0;
        totalsteps = 0;
        totaldays = 0;
        dailysteps = 0;
        averagesteps = 0;
    }

    public void addDailySteps(int num_steps)
    {
        if (num_steps >= this.threshold)
        {
            this.activedays += 1;
            
        }
        this.totalsteps += num_steps;
        this.totaldays += 1;
    }

    public float averageSteps()
    {
        return (float)totalsteps/totaldays; 
    }

    public int activeDays()
    {
        return this.activedays;
    }

}

public class Main {


    public static void main(String[] args) {
	    StepTracker tr = new StepTracker(10000);
        System.out.println("tr.activeDays() is" + tr.activeDays());
        System.out.println("tr.averageSteps()" + tr.averageSteps());
        tr.addDailySteps(9000);
        tr.addDailySteps(5000);
        System.out.println("tr.activeDays()" + tr.activeDays());
        System.out.println("tr.averageSteps()" + tr.averageSteps());
        tr.addDailySteps(13000);
        System.out.println("tr.activeDays()" + tr.activeDays());
        System.out.println("tr.averageSteps()" + tr.averageSteps());
        tr.addDailySteps(23000);
        tr.addDailySteps(1111);
        System.out.println("tr.activeDays()" + tr.activeDays());
        System.out.println("tr.averageSteps()" + tr.averageSteps());
    }
}
