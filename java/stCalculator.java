import java.util.Scanner;
public class stCalculator{
    public static void main (String args[]){
        Scanner scanner= new Scanner(System.in);

        System.out.println("Enter number of subjects: ");
        int subjects= scanner.nextInt();

        int total=0;
        for ( int i=1; i<=subjects; i++){
            System.out.print("Enter marks for Subject " + i + ":");
            total = total + scanner.nextInt();
        }

        double avg= (double) total/subjects;
        System.out.println("Total marks: "+ total);
        System.out.println("Average percentage: "+ avg);

        if (avg >= 90) {
            System.out.println("Grade: A");
        } else if (avg >= 80) {
            System.out.println("Grade: B");
        } else if (avg >= 70) {
            System.out.println("Grade: C");
        } else if (avg >= 60) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: F");
        }
    }
}