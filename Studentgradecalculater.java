import java.util.Scanner;

public class Studentgradecalculater {
    public static void main(String[] args) {

        double subject = 0.0;
        Double totalMarks = 0.0;
        char grade;
        Scanner sc = new Scanner(System.in);
        System.out.println("System: Enter number of subjects");
        int number_of_subjects = sc.nextInt();
        System.out.println("System: Enter all subject marks in order out of 100 ");
        for (int i = 0; i < number_of_subjects; i++) {
            subject = sc.nextDouble();
           if (subject > 100) {
                System.out.println("System: enter again");
                number_of_subjects++;
            } else {
                totalMarks += subject;
            }
        }
        double avgPercentage = (totalMarks / number_of_subjects);
        if (avgPercentage > 0 && avgPercentage < 20) {
            grade = 'E';
        }
        else if (avgPercentage > 20 && avgPercentage < 40) {
            grade = 'D';
        }
        else if (avgPercentage > 40 && avgPercentage < 60) {
            grade = 'C';
        }
        else if (avgPercentage > 60 && avgPercentage < 80) {
            grade = 'B';
        }
        else if (avgPercentage > 80 && avgPercentage < 100) {
            grade = 'A';
        } else {
            grade = 00;
         }
         System.out.println(" System : Your total marks is\n " + totalMarks + " with average percentage \n " + avgPercentage + " and grade\n " + grade );
            
    } 

}
