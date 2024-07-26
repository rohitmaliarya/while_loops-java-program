import java.util.Random;

public class RandomEvenNumbers {
    public static void main(String[] args) {
        Random random = new Random();

        int count = 0;
        while (count < 2) { 
            int number = 34 + random.nextInt(67 - 34 + 1); 
            if (number % 2 == 0) { 
                System.out.println(number); 
                count++;
            }
        }
    }
}
 
    

