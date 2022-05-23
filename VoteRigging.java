/*
You have used your secret mind-reading device to find out how every voter will vote 
in the next election. Your mind-reading device also revealed to you that all the voters 
are prepared to change their vote if you pay them enough.
The ith element of votes is the number of people who were originally planning to vote for 
candidate i. Return the minimum number of votes that you must change to ensure that candidate 
0 (your favorite) will have more votes than any other candidate.
*/

public class VoteRigging {
    private int calcMax(int[] counts) {
        int max = 0;
        int maxInd = -1;
        for(int i = 0; i < counts.length; i++) {
            if(counts[i] >= max) {
                max = counts[i];
                maxInd = i;
            }
        }
        return maxInd;
    }


    public int minimumVotes(int[] votes) {
        int total = 0;
        while(calcMax(votes) != 0) {
            votes[calcMax(votes)] -= 1;
            votes[0] += 1;
            total ++;
        }
        return total;
    }
 }