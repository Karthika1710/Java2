
import java.util.Scanner;

public class GradeCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numSubjects = 5;
        double[] scores = new double[numSubjects];

        System.out.println("Enter the score for Mathematics: ");
        scores[0] = scanner.nextDouble();

        System.out.println("Enter the score for Science: ");
        scores[1] = scanner.nextDouble();

        System.out.println("Enter the score for English: ");
        scores[2] = scanner.nextDouble();

        System.out.println("Enter the score for History: ");
        scores[3] = scanner.nextDouble();

        System.out.println("Enter the score for Art: ");
        scores[4] = scanner.nextDouble();

        double averageScore = calculateAverage(scores);

        char grade = determineGrade(averageScore);

        System.out.println("Average Score: " + averageScore);
        System.out.println("Grade: " + grade);

        scanner.close();
    }

    public static double calculateAverage(double[] scores) {
        double sum = 0;
        for (double score : scores) {
            sum += score;
        }
        return sum / scores.length;
    }

    public static char determineGrade(double averageScore) {
        if (averageScore >= 90) {
            return 'A';
        } else if (averageScore >= 80) {
            return 'B';
        } else if (averageScore >= 70) {
            return 'C';
        } else if (averageScore >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }
}
