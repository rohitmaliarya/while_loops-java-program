 import java.util.Scanner;

public class PrintUserInputRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the start number: ");
        int start = scanner.nextInt();
        System.out.println("Enter the end number: ");
        int end = scanner.nextInt();

        int i = start; 

        while (i <= end) { 
            System.out.println(i); 
            i++; 
    
        }
    }
}
 
    

