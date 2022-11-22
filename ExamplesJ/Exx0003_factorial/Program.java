import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        System.out.println("Enter the intger:\t\n");
        Scanner iScanner = new Scanner(System.in);
        int num = iScanner.nextInt();
        double result = Factorial(num);
        iScanner.close();
        System.out.printf("Factorial of %d: %d", num, result);
    }

    public static double Factorial(int number) {
        if (number == 1)
            return 1;
        return number * Factorial(number - 1);
    }
}


    
        
    

    
        
    

    
        
    