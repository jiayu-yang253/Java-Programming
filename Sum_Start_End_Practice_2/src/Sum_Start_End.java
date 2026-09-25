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
