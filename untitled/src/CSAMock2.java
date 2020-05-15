import java.util.ArrayList;

public class ScoreInfo
{
    private int score;
    private int numStudents;
    public ScoreInfo(int aScore)
    {
        score = aScore;
        numStudents = 1;
    }

    public void increment() {
        numStudents ++;
    }

    public int getScore() {
        return score;
    }

    public int getFrequency() {
        return numStudents;
    }
}

public class Stats
{
    private ArrayList<ScoreInfo> scoreList = new ArrayList<ScoreInfo>();

    public boolean record(int score) {

        boolean flag = true;
        for(ScoreInfo si: scoreList) {
            if(si.getScore() == score) {
                si.increment();
                flag = false;
                break;
            }
        }
        if(flag) {
            scoreList.add(new ScoreInfo(score));
        }
        return flag;
    }

    public void recordScores(int[] stuScores) {
        for(int each: stuScores) {
            boolean temp = record(each);
        }
    }

    public double getSeniorPercent(int score) {
        //declare a new private variable numSeniors in the ScoreInfo class
        //pass in a boolean value isSenior while adding scores, if senior, they are incremented
        return 0.5;
    }
}