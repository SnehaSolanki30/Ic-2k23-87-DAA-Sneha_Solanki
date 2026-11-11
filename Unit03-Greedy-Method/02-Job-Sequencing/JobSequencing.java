import java.util.Arrays;
import java.util.Comparator;

public class JobSequencing {

    static class Job {
        String id;
        int deadline, profit;

        Job(String id, int deadline, int profit) {
            this.id = id;
            this.deadline = deadline;
            this.profit = profit;
        }
    }

    public static void main(String[] args) {

        Job[] jobs = {
            new Job("J1", 2, 100),
            new Job("J2", 1, 19),
            new Job("J3", 2, 27),
            new Job("J4", 1, 25),
            new Job("J5", 3, 15)
        };

        Arrays.sort(jobs, new Comparator<Job>() {
            public int compare(Job a, Job b) {
                return b.profit - a.profit;
            }
        });

        int maxDeadline = 0;

        for (Job job : jobs)
            maxDeadline = Math.max(maxDeadline, job.deadline);

        String[] slots = new String[maxDeadline];
        int totalProfit = 0;

        for (Job job : jobs) {

            for (int j = Math.min(maxDeadline, job.deadline) - 1;
                 j >= 0; j--) {

                if (slots[j] == null) {
                    slots[j] = job.id;
                    totalProfit += job.profit;
                    break;
                }
            }
        }

        System.out.println("Selected Jobs:");

        for (String job : slots)
            if (job != null)
                System.out.print(job + " ");

        System.out.println("\nTotal Profit = " + totalProfit);
    }
}
