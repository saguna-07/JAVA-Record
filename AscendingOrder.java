EXP.NO:1A
DATE:28-07-26
                            SORT IN ASCENDING ORDER    
Aim:
To write a Java program to arrange the elements of an array in ascending order.

Algorithm:
1.	Start the program.
2.	Import the Scanner class to read input from the user.
3.	Read the number of elements n.
4.	Create an integer array a of size n.
5.	Read all n elements into the array.
6.	Compare each element with the elements after it using two for loops.
7.	If a[i] > a[j], swap the two elements using a temporary variable.
8.	Repeat the comparison until all elements are arranged in ascending order.
9.	Display the sorted array.
Stop the program.

Code:
import java.util.Scanner; 
public class AscendingOrder {
    public static void main(String[] args) {
        int n, temp;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no.of elements you want in array: ");
        n = s.nextInt();
        int a[] = new int[n];
        System.out.println("Enter all the elements:");
        for (int i = 0; i < n; i++) { // Fixed typo 'inti' to 'int i'
            a[i] = s.nextInt();
        }
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.print("Ascending Order: ");
        for (int i = 0; i < n - 1; i++) {
            System.out.print(a[i] + ",");
        }
        System.out.print(a[n - 1]);
    }
}

Output:
Enter no.of elements you want in array: 5
Enter all the elements:
45 12 78 23 9
Ascending Order: 9,12,23,45,78

Result:
Thus, the Java program was successfully executed to sort the given array elements in ascending order.

