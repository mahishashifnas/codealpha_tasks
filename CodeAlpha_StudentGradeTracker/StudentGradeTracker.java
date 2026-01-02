package CodeAlpha_StudentGradeTracker;
import java.util.ArrayList;
import java.util.Scanner;
public class StudentGradeTracker{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        ArrayList<String> studentNames = new ArrayList<>();
        ArrayList<Integer> studentMarks = new ArrayList<>();
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            sc.nextLine();
            System.out.print("Enter student name: ");
            String name = sc.nextLine();
            System.out.print("Enter marks: ");
            int marks = sc.nextInt();
            studentNames.add(name);
            studentMarks.add(marks);
        }
        //calculate highest,lowest,average
        int total = 0;
        int highest = studentMarks.get(0);
        int lowest = studentMarks.get(0);
        for(int mark : studentMarks){
            total += mark;
            if(mark > highest)
                highest = mark;
            if(mark < lowest)
                lowest = mark;
        }
        double average = (double) total / n;
        System.out.println("\n---- Student Grade Summary ----");
        for(int i = 0; i < n; i++)
        {
            System.out.println(studentNames.get(i) + " : " + studentMarks.get(i));

        }
        System.out.println("--------------------");
        System.out.println("Average Score: " + average);
        System.out.println("Highest Score: " + highest);
        System.out.println("Lowest Score : " + lowest);
        sc.close();
    }
}