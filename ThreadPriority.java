EXP NO:10(b)
DATE:15-09-26
                                       THREAD PRIORITY
Aim:
To write and execute a Java program to demonstrate thread priorities using the `Thread` class and the methods `setPriority()` and `getPriority()`.

Algorithm:
1. Start the program.
2. Create three classes A, B, and C by extending the `Thread` class.
3. Override the `run()` method in each class.
4. Print thread starting messages and execute loops from 1 to 4.
5. Create objects of classes A, B, and C in the main method.
6. Set the priority of thread C to `Thread.MAX_PRIORITY`.
7. Set the priority of thread B to one greater than thread A's priority.
8. Set the priority of thread A to `Thread.MIN_PRIORITY`.
9. Start all three threads using the `start()` method.
10. Display the main thread ending message.
11. Stop the program.

Code:
import java.io.*;
class A extends Thread
{
public void run()
{
System.out.println("Thread A started"); for(int i=1;i<=4;i++)
{
System.out.println("from thread A i="+i);
}
System.out.println("exit from A");
}
}
class B extends Thread
{
public void run()
{
System.out.println("Thread B started"); for(int j=1;j<=4;j++)
{
System.out.println("from thread B j="+j);
}
System.out.println("exit from B");
}
}
class C extends Thread
{
public void run()
{
System.out.println("thread C started"); for(int k=1;k<=4;k++)
{
System.out.println("thread c ="+k);
}
System.out.println("exit from c");
}
}
class ThreadPriority
{
public static void main(String[]args)
 {
A threadA = new A();
B threadB = new B();
C threadC = new C(); 
threadC.setPriority(Thread.MAX_PRIORITY); 
threadB.setPriority(threadA.getPriority()+1); 
threadA.setPriority(Thread.MIN_PRIORITY); 
System.out.println("start thread A"); 
threadA.start();
System.out.println("start thread B"); 
threadB.start(); 
System.out.println("start thread C"); 
threadC.start();
System.out.println("end of main thread");
}
}

Output:
start thread A
Thread A started
start thread B
from thread A i=1
from thread A i=2
from thread A i=3
from thread A i=4
exit from A
Thread B started
start thread C
from thread B j=1
from thread B j=2
from thread B j=3
from thread B j=4
exit from B
thread C started
thread c =1
thread c =2
thread c =3
thread c =4
exit from c
end of main thread

Result:
Thus, the Java program was executed successfully to demonstrate thread priorities using `setPriority()`, `getPriority()`, `MIN_PRIORITY`, and `MAX_PRIORITY`.
