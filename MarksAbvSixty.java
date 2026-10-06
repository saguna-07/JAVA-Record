EXP.NO:1D
DATE:28-07-26
                        TO PRINT MARKS ABOVE 60
Aim:
To display the names and marks of students who scored more than 60 marks.
    
Algorithm:
1.	Create arrays to store student names and marks.
2.	Read the name and marks of 6 students.
3.	Check each student's marks.
4.	If marks are greater than 60, display the student's name and marks.
5.	Stop the program.
    
Code:
import java.util.Scanner;
public class MarksAbvSixty
{
    public static void main(String args[])
    {
        int marks[] = new int[6];
        String name[] = new String[6];
        int i;
        Scanner scanner = new Scanner(System.in);
        for(i = 0; i < 6; i++)
        {
            System.out.print("Enter Name of Student and Marks of Subject " + (i + 1) + ": ");
            name[i] = scanner.next();
            marks[i] = scanner.nextInt();
        }
        System.out.println("\nStudents scoring more than 60:");

        for(i = 0; i < 6; i++)
        {
            if(marks[i] > 60)
            {
                System.out.println(name[i] + " : " + marks[i]);
            }
        }
    }
}
Output:
Enter Name of Student and Marks of Subject 1: Ravi 75
Enter Name of Student and Marks of Subject 2: Priya 55
Enter Name of Student and Marks of Subject 3: Arun 82
Enter Name of Student and Marks of Subject 4: Sita 60
Enter Name of Student and Marks of Subject 5: Kiran 68
Enter Name of Student and Marks of Subject 6: Anu 45

Students scoring more than 60:
Ravi : 75
Arun : 82
Kiran : 68
    
Result:
Thus, the students who scored more than 60 marks are successfully displayed.
