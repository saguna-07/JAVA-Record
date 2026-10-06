EXP.NO:1B
DATE:28-07-26
                                BINARY SEARCH
Aim:
To search for an element in a sorted array using Binary Search.

Algorithm:
1.	Read the number of elements and sorted array elements.
2.	Read the element to be searched.
3.	Set first = 0 and last = n-1.
4.	Find the middle element.
5.	Compare it with the search element and adjust the search range.
6.	Repeat until the element is found or the range becomes empty.
7.	Display the result.
    
Code:
import java.util.Scanner;
class BinarySearch
{
public static void main(String args[])
    {
        int i, mid, first, last, x, n, flag = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter elements in sorted order:");
        for(i = 0; i < n; i++)
        {
            a[i] = sc.nextInt();
        }
        System.out.print("Enter element to search: ");
        x = sc.nextInt();
        first = 0;
        last = n - 1;
        while(first <= last)
        {
            mid = (first + last) / 2;
            if(a[mid] == x)
            {
                flag = 1;
                System.out.println("Element found at position " + (mid + 1));
                break;
            }
            else if(a[mid] < x)
            {
                first = mid + 1;
            }
            else
            {
                last = mid - 1;
            }
        }

        if(flag == 0)
        {
            System.out.println("Element not found");
        }
    }
}
Output:
Enter number of elements: 5
Enter elements in sorted order:
10 20 30 40 50
Enter element to search: 30
Element found at position 3
    
Result:
Thus, the element is successfully searched using Binary Sear

