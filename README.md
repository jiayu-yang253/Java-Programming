# Java-Programming
lecture and practice

practice1
task1
1.down load IDE and setup to D:\JIAYU ��ѧ\IntelliJ IDEA 2026.2.2

task2
2.create github account
3.setup Git-2.18.0-64-bit.exe and TortoiseGit-2.6.0.0-64bit.msi, and config ssh 
4.new repository Java Programming https://github.com/jiayu-yang253/Java-Programming
5.new branches lecture and practice

6.new java class, then printIo Hello world! to console, pls refer to the guideline

public class helloworld {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}

practice2
repeate practice6 step6
task1
import java.util.Scanner;
public class Sum_Start_End {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter start integer: ");
        int start = scanner.nextInt();
        System.out.print("Enter end integer: ");
        int end = scanner.nextInt();
        if (end >= start) {
            int sum = 0;
            for (int i = start; i <= end; i++) {
                sum = sum + i;
            }
            System.out.println("The sum from " + start + " to " + end + " is: " + sum);
        } else {
            System.out.println("Error: start cannot be larger than end!");
        }
        scanner.close();
    }
}

task2 
scanner end < start, report error

practice3.pdf 

