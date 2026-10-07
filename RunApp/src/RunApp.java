import java.util.Scanner;
public class RunApp {
    public void main(String[] args){
        int x = 0;
        int y = 2;
        int z = 0;
        char operator ='+';
        Scanner input = new Scanner(System.in);
        Calculator calculator=new Calculator();
        while(true){
            System.out.printf("input your number of x:");
            x = input.nextInt();
            System.out.printf("input your operator:");
            operator = input.next().charAt(0);
            System.out.printf("input your number of y:");
            y = input.nextInt();
            switch (operator){
                case '+':
                    z= calculator.add(x,y);
                    System.out.printf("%d+%d=%d%n",x,y,z);
                    break;
                case '-':
                    z=calculator.subtract(x,y);
                    System.out.printf("%d-%d=%d%n",x,y,z);
                    break;
                case '*':
                    z=calculator.multiply(x,y);
                    System.out.printf("%d*%d=%d%n",x,y,z);
                    break;
                case 'q':
                case 'Q':
                    System.out.println("q、Q quit:");
                    input.close();
                    return;
                default:
                    System.out.println("invalid operator, enter q、Q quit:");
                    break;
            }
        }



    }
}
