
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 0;
        int total = 0;

        while (true) {
            System.out.println("Give a number:");
            int number = Integer.valueOf(scanner.nextLine());
            total = total + number;
            count = count + 1;
            

            if (number == 0) {
                count = count - 1;
                double average = (double) total / count;
                System.out.println("Average of the numbers: " + total);
                break;
            }
        }
    }
}
