import java.util.*;

public class AverageCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome To India's Got Latent Average Calculator ! ");

        System.out.println("Enter The Number Of Judges : ");

        int numJudges = sc.nextInt();

        double [] scores = new double[numJudges];
        double sum = 0;

        System.out.println("Enter The Scores GivenBy Each Judge : ");
        
        for(int i = 0 ;i<numJudges ;i++) {
            System.out.println("Judge " + (i+1) + "s score");
            scores[i] = sc.nextDouble();
            sum += scores[i];
        }
        //calculating the average score by deviding the total sum by number of judges 
        double average = sum / numJudges;
            System.out.println("The Average score is : " + average);

            System.out.println("samay raina approves the calculation 🏆");

    }
}