import java.util.Date;
import java.util.Scanner;

public class StudentMarksheet {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int total, RollNumber, english, marathi, physics, chemistry, maths;
        float percentage;
        String Name;

        System.out.println("Enter the Name :");
        Name = in.next();
        System.out.println("Enter Roll Number :");
        RollNumber = in.nextInt();

        System.out.println("-------------------------------------");
        System.out.println("Enter the Subject's marks out of 100 ");
        System.out.println("-------------------------------------");

        System.out.println("Enter the English Marks");
        english = in.nextInt();
        System.out.println("Enter the Marathi Marks");
        marathi = in.nextInt();
        System.out.println("Enter the Physics Marks");
        physics = in.nextInt();
        System.out.println("Enter the Chemistry Marks");
        chemistry = in.nextInt();
        System.out.println("Enter the Maths Marks");
        maths = in.nextInt();

        total = english + marathi + physics + chemistry + maths;
        percentage = total / 5;


        Date cd = new Date();

        System.out.println(" ");
        System.out.println("\t   WILSON COLLEGE OF ARTS ,COMMERCE & SCIENCE ");
        //all occurrences of object are replaced by T or represent a tab char
        System.out.println("=============================================================");
        System.out.println(" Date :" + cd);
        System.out.print(" Value education is instrumental in young genreation empowerment " );
        System.out.println(" ");
        System.out.println("-------------------STUDENT MARKSHEET--------------------------------");

        System.out.println("Welcome " + Name);
        System.out.println("Roll Number " + RollNumber);

        System.out.println("================================================================");
        System.out.println("English Marks    = " + english);
        System.out.println("Marathi Marks    = " + marathi);
        System.out.println("Physics Marks    = " + physics);
        System.out.println("Chemistry Marks  = " + chemistry);
        System.out.println("Maths Marks      = " + maths);
        System.out.println("=================================================================");
        System.out.println("Total Marks  = " + total);
        if (percentage >= 70) {
            System.out.println("Grade is A " );
        } else if (percentage >= 60 && percentage <= 70) {
            System.out.println("Grade is B " );
        } else if (percentage >= 50 && percentage <= 60) {
            System.out.println("Grade is C " );
        } else if (percentage >= 40 && percentage <= 50) {
            System.out.println("Grade is D " );
        } else {
            System.out.println("Failed the Exam " );
        }
        System.out.println("Overall percentage is " + percentage);
        System.out.println(" ");
        System.out.println(" ********************  THANKS  *************************");
    }
}


