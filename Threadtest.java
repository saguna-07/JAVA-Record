EXP NO:10(a)
DATE:13-09-26
                                    SIMPLE THREAD
Aim:
To write a Java program to demonstrate multithreading using the `Thread` class and methods like `yield()` and `sleep()`.

Algorithm:
1. Start the program.
2. Create three classes A, B, and C by extending the `Thread` class.
3. Override the `run()` method in all three classes.
4. In class A, execute a loop from 1 to 5 and use `Thread.yield()` when `i == 1`.
5. In class B, print values from 1 to 3 and terminate the loop using `break`.
6. In class C, print values from 1 to 5 and use `Thread.sleep(1500)` when `k == 1`.
7. Create objects of A, B, and C in the main method.
8. Start all three threads using the `start()` method.
9. Print the main thread exit message.
10. Stop the program.

Code:
import java.util.*,
class A extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            if (i == 1) {
                Thread.yield();
            }

            System.out.println("from thread A i=" + i);
        }

        System.out.println("exit from A");
    }
}
class B extends Thread {
    public void run() {
        for (int j = 1; j <= 5; j++) {
            System.out.println("from thread B j=" + j);

            if (j == 3) {
                System.out.println("exit from B");
                break;
            }
        }
    }
}
class C extends Thread {
    public void run() {
        for (int k = 1; k <= 5; k++) {
            System.out.println("thread C = " + k);

            if (k == 1) {
                try {
                    Thread.sleep(1500);
                } catch (InterruptedException e) {
                    System.out.println("Thread C interrupted");
                }
            }
        }
    }
}
public class Threadtest {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();

        System.out.println("Start thread A");

        a.start();
        b.start();
        c.start();

        System.out.println("exit from main thread");
    }
}

Output:
Start thread A
exit from main thread
from thread A i=1
from thread B j=1
from thread B j=2
from thread B j=3
exit from B
thread C = 1
from thread A i=2
from thread A i=3
from thread A i=4
from thread A i=5
exit from A
thread C = 2
thread C = 3
thread C = 4
thread C = 5

Result:
Thus, the Java program was executed successfully, demonstrating multithreading using the `Thread` class and the methods `start()`, `yield()`, and `sleep()`.
