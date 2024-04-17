// Job Sequencing
// Input :  jobs    deadline, profit
//          JOB A :     4,      20
//          JOB B :     1,      10
//          JOB C :     1,      40
//          JOB D :     1,      30
// Output : Selected Jobs : C, A

import java.util.*;

public class p7 {
    static class Job {
        int deadline;
        int profit;
        int id; // 0(A), 1(B), 2(C), 3(D)

        public Job(int id, int deadline, int profit) {
            this.id = id;
            this.deadline = deadline;
            this.profit = profit;
        }
    }

    public static void main(String[] args) {
        int jobsInfo[][] = { { 4, 20 }, { 1, 10 }, { 1, 40 }, { 1, 30 } };

        ArrayList<Job> jobs = new ArrayList<>();

        for (int i = 0; i < jobsInfo.length; i++) {
            jobs.add(new Job(i, jobsInfo[i][0], jobsInfo[i][1]));
        }

        // Sort objects in descending order
        Collections.sort(jobs, (obj1, obj2) -> obj2.profit - obj1.profit);

        ArrayList<Integer> seq = new ArrayList<>();
        int time = 0;
        for (int i = 0; i < jobs.size(); i++) {
            Job curr = jobs.get(i);
            if (curr.deadline > time) {
                seq.add(curr.id);
                time++;
            }
        }

        // print seq
        System.out.println("Maximum jobs: " + seq.size());
        for (int i = 0; i < seq.size(); i++) {
            System.out.print(seq.get(i)+ " ");
        }
        System.out.println();
    }
}
