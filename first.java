public class ScoreInfo {
    private int score;
    private int numStudents;

    public ScoreInfo(int aScore) {
        score = aScore;
        numStudents = 1;
    }
    
    public void increment() { numStudents++; }
    public int getScore() { return score; }
    public int getFrequency() { return numStudents; }
}


public class Stats {
    private ArrayList<ScoreInfo> scoreList;

    public boolean record(int score) {
        boolean check = false;
        ScoreInfo s1 = new ScoreInfo(score);
        scoreList.add(s1);
        for(int i = 0; i < scoreList.size(); i++) {
            if(score == scoreList.get(i).getScore()) {
                s1.increment();
            } else {
            ScoreInfo s1 = new ScoreInfo(score);
            check = true;
            }
        }
    
        for(int j = 0; j < scorwList.size(); j++) {
            for(int n = j; n < scoreList.size(); n++) {
                if (scoreList.get(j+1) < scoreList.get(j)) {
                    int temp = scoreList.get(j);
                    scoreList.get(j) = scoreList.get(j+1),
                    scoreList.get(j+1) = temp;
                }
            }
        }
        return check;
    }
}


public void recordScores(int[] stuScores) {
    for(int i = 0; i < stuScores.length; i++) {
        boolean b = record(stuStudents(i));
    }
}
