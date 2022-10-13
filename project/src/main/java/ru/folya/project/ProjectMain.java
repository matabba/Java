import java.util.Scanner;
public class practice {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Type First Number");
        int num1 = sc.nextInt();

        System.out.println("Type Second Number");
        int num2 = sc.nextInt();

        System.out.println("Type Operation");
        sc.nextLine();
        String action = sc.nextLine();
        action = sc.nextLine();

        int result = 0;
        System.out.println("Operation result: " + result);

        int res;

        switch (action) {
            case "+":
                res = num1 + num2;
                System.out.println("Result " + result);
                break;
            case "-":
                res = num1 - num2;
                System.out.println("Result " + result);
                break;
            case "*":
                res = num1 * num2;
                System.out.println("Result " + result);
                break;
            case "/":
                if(num1 == 0)
                System.out.print("Error");
            else
                res = num1 / num2;
                System.out.println("Result " + result);
                break;
            default:
                System.out.println("Wrong.");


        }
    }
}
