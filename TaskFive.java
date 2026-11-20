import java.util.Scanner;

public class TaskFive {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int[] scores = new int[5];
        for (int i = 0; i < scores.length; i++){
            System.out.print("Enter score " + (i+1) + "(0-100): ");
            int sc = s.nextInt();
            while (sc < 0 || sc > 100){
                System.out.print("Invalid! Enter score from 0 to 100: ");
                sc = s.nextInt();
            }
            scores[i] = sc;
        }
        int pass = 0;
        int fail = 0;
        int aver = 0;
        System.out.print("Scores: ");
        for (int n = 0; n < scores.length; n++){
            System.out.print(scores[n] + " ");
            if (scores[n] >= 60)
                pass++;
            else if (scores[n] < 60)
                fail++;
            aver += scores[n];
        }
        System.out.println("\nPassed: " + pass);
        System.out.println("Failed: " + fail);
        System.out.println("Average: " + aver/5);
    }
}