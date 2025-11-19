import java.util.Scanner;
public class GradeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      System.out.print("Enter the numerical score(0-100): ");
      int score = scanner.nextInt();

        if (score >= 80 && score <= 100) {
            System.out.println("Grade: A");
        } else if (score >= 70) {
            System.out.println("Grade: B");
        } else if (score >= 60) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: Fail");
        }
        scanner.close();
    }
}
