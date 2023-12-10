public class ScoreInfo {
    private int score;
    private int numStudents;

    public ScoreInfo(int aScore) {
        score = aScore;
        numStudents = 1;
    }

    public void increment() 
    { numStudents++; }

    public int getScore() 
    { return score; }

    public int getFrequency() 
    { return numStudents; }
}


// Stats class creates and maintains a database of student score information. The scores are sorted in sorted order in database
public class Stats {
    private ArrayList<ScoreInfo> scoreList;
    // listed in increasing score order; no two ScoreInfo object contain the same score 

    /*
     * Records a score in the database, keeping the databse in increasing score order. If no other ScoreInfo object represents score, 
     * a new ScoreInfo object representing score is added to the database; otherwise, the frequency in the ScoreInfo object representing
     * score is incremented
     * @param score - a score to be recorded in the list
     * @return true - if a new ScoreInfo object representing score was added to the list; false otherwise
    */
    scorrList = new ArrayList<ScoreInfo>();
    public boolean record(int score) {
        boolean check = false;
        ScoreInfo s1 = new ScoreInfo(score);
        for(int i = 0; i < scoreList.size(); i++) {
            if(score == scoreList.get(i).getScore()) {
                s1.increment(); 
            } else {
            scoreList.add(s1);
            check = true;
            }
        }
    
        for(int j = 0; j < scoreList.size(); j++) {
            for(int n = j; n < scoreList.size(); n++) {
                if (scoreList.get(j+1).getScore() < scoreList.get(j).getScore()) {
                    int temp = scoreList.get(j);
                    scoreList.get(j) = scoreList.get(j+1),
                    scoreList.get(j+1) = temp;
                }
            }
        }
        return check;
    }

    /*
     * Records all scores in stuScores in the databse, keeping the databse in increasing order
     * @param stuScores - an array of student test scores
    */
    public void recordScores(int[] stuScores) {
        for(int i = 0; i < stuScores.length; i++) {
            boolean b = record(stuStudents(i));
        }
    }
}



